import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileToUpperCase {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"));
             PrintWriter writer = new PrintWriter(new FileOutputStream("output.txt"))) {
            while (scanner.hasNextLine()) {
                writer.println(scanner.nextLine().toUpperCase());
            }
        }
    }
}



