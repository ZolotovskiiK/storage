import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        String password = "Hello";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль ");
        String userLine = scanner.nextLine();

        if (password.equals(userLine)) {
            System.out.println("Пароль верный");
        } else if (password.length() < userLine.length()) {
            System.out.println("Пароль неверный, строка слишком длинная");
        } else if (password.length() > userLine.length()) {
            System.out.println("Пароль неверный, стока слишком короткая");
        } else {
            System.out.println("Пароль неверный");
        }
    }
}