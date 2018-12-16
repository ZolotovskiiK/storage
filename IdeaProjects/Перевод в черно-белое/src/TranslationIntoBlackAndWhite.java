import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;


public class TranslationIntoBlackAndWhite {
    public static void main(String[] args) throws IOException {

        BufferedImage image = ImageIO.read(new File("image.jpg"));
        WritableRaster raster = image.getRaster();

        int width = raster.getWidth();
        int height = raster.getHeight();

        final int COLORS_COUNT_IN_RGB = 3;

        int[] pixel = new int[COLORS_COUNT_IN_RGB];

        for (int j = 0; j < height; ++j) {

            for (int i = 0; i < width; ++i) {
                raster.getPixel(i, j, pixel);
                int color = (int) (0.3 * pixel[0] + 0.59 * pixel[1] + 0.11 * pixel[2]);
                for (int k = 0; k < COLORS_COUNT_IN_RGB; ++k) {
                    pixel[k] = color;
                }
                raster.setPixel(i, j, pixel);
            }
        }
        ImageIO.write(image, "png", new File("out.png"));
    }
}
