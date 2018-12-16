import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberOfOccurrences {
    private static int getNumberOfOccurrences(String text, String searchString) {
        int indexStart = 0;
        int count = 0;

        searchString = searchString.toLowerCase();
        String lowerLine = text.toLowerCase();

        while (true) {
            int occurrencesIndex = lowerLine.indexOf(searchString, indexStart);
            indexStart = occurrencesIndex + searchString.length();
            if (occurrencesIndex == -1) {
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            StringBuilder sb = new StringBuilder();

            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine()).append(System.lineSeparator());
            }
            String text = sb.toString();
            String searchString = "text";
            int result = getNumberOfOccurrences(text, searchString);

            System.out.println("Число вхождений: " + result);
        }
    }
}