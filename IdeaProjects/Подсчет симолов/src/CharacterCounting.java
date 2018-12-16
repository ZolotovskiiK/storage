import java.util.Scanner;

public class CharacterCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = scanner.nextLine();
        int countDigit = 0;
        int countLetter = 0;
        int countWhiteSpace = 0;
        int countOtherSymbol = 0;

        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);

            if (Character.isDigit(c)) {
                ++countDigit;
            } else if (Character.isLetter(c)) {
                ++countLetter;
            } else if (Character.isWhitespace(c)) {
                ++countWhiteSpace;
            } else {
                ++countOtherSymbol;
            }
        }
        System.out.println("Количество букв в этой строке " + countLetter);
        System.out.println("Количество цифр в этой строке " + countDigit);
        System.out.println("Количество пробелов в этой строке " + countWhiteSpace);
        System.out.println("Количество остальных символов в этой строке " + countOtherSymbol);
    }
}
