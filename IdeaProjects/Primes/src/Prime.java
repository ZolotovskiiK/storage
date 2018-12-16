import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int divisor = 0;

        for (int i = 2; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    ++divisor;
                }
            }
            if (divisor == 2) {
                System.out.println(i);
            }
            divisor = 0;
        }
    }
}