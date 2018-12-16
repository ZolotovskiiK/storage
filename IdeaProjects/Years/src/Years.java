import java.util.Scanner;

public class Years {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Это високосный год");
        } else {
            System.out.println("Это не весокосный год");
        }
    }
}