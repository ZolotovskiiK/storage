import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Classwork10 {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {

           double[] numbers = new double[10];
           int i = 0;
           while(scanner.hasNextDouble()){
               numbers[i] =scanner.nextDouble();
               ++i;
           }

          double[] resultNumbers = Arrays.copyOf(numbers,i);
           System.out.println(Arrays.toString(resultNumbers));
        }
    }

}
