import java.util.Scanner;

public class GCD {
    private static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        while (b != 0) {
            if (a % b == 0) {
                return b;
            }
            int gcd = a % b;
            a = b;
            b = gcd;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите значение а:");
        int a = scanner.nextInt();

        System.out.print("Укажите значение b:");
        int b = scanner.nextInt();

        int result = getGCD(a, b);
        System.out.println("НОД = " + result);
    }
}
