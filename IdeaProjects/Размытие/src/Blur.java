import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blur {
    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("image.jpg"));
        BufferedImage imageSource = ImageIO.read(new File("image.jpg"));

        WritableRaster raster = image.getRaster();
        WritableRaster rasterSource = imageSource.getRaster();

        final int COLORS_COUNT_IN_RGB = 3;

        double[] pixel = new double[COLORS_COUNT_IN_RGB];
        int[] pixelSource = new int[COLORS_COUNT_IN_RGB];

        double filterPower = 1.0 / 25.0;

        double[][] filterMatrix = {
                {filterPower, filterPower, filterPower, filterPower, filterPower},
                {filterPower, filterPower, filterPower, filterPower, filterPower},
                {filterPower, filterPower, filterPower, filterPower, filterPower},
                {filterPower, filterPower, filterPower, filterPower, filterPower},
                {filterPower, filterPower, filterPower, filterPower, filterPower},
        };

        int halfFilterSize = filterMatrix.length / 2;

        int width = raster.getWidth() - halfFilterSize;
        int height = raster.getHeight() - halfFilterSize;

        for (int j = halfFilterSize; j < height; ++j) {
            for (int i = halfFilterSize; i < width; ++i) {
                for (int k = 0; k < COLORS_COUNT_IN_RGB; ++k) {
                    pixel[k] = 0;

                    for (int innerJ = -halfFilterSize; innerJ <= halfFilterSize; innerJ++) {
                        for (int innerI = -halfFilterSize; innerI <= halfFilterSize; innerI++) {
                            rasterSource.getPixel(i + innerI, j + innerJ, pixelSource);
                            pixel[k] += pixelSource[k] * filterMatrix[innerJ + halfFilterSize][innerI + halfFilterSize];
                        }
                    }

                    if (pixel[k] > 255) {
                        pixel[k] = 255;
                    } else if (pixel[k] < 0) {
                        pixel[k] = 0;
                    }
                }

                raster.setPixel(i, j, pixel);
            }
        }

        ImageIO.write(image, "png", new File("out.png"));
    }
}
