import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        String password = "Hello World";

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите строку: ");
            String userLine = scanner.nextLine();
            if (password.equals(userLine)) {
                System.out.println("Вы ввели верную строку!");
                break;
            }
        }
    }
}