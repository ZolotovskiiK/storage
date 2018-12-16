import java.util.Scanner;

public class FibonacciNumber {
    private static int getFibonacciNumber(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1 || number == 2) {
            return 1;
        } else {
            int i = 2;
            int fib1 = 1;
            int fib2 = 1;
            int fibSum = 0;
            while (i < number) {
                fibSum = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibSum;
                i++;
            }
            return fibSum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите номер числа Фибоначчи:");
        int number = scanner.nextInt();

        int x = getFibonacciNumber(number);
        System.out.println("Указанному вами номеру соответсвует число: " + x);
    }
}
