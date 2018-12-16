import java.util.Scanner;

public class Exponentiation {
    private static int getRecursiveExponentiation(int number, int pow) {
        if (pow == 0) {
            return 1;
        } else if (pow == 1) {
            return number;
        } else {
            return number * (getRecursiveExponentiation(number, pow - 1));
        }
    }

    private static int getExponentiation(int number2, int pow2) {
        int exponentiation = 1;
        for (int i = 1; i <= pow2; i++) {
            exponentiation *= number2;
        }
        return exponentiation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите число");
        int number = scanner.nextInt();
        System.out.println("Введите степень");
        int pow = scanner.nextInt();
        int result = getRecursiveExponentiation(number, pow);
        System.out.println(result);

        System.out.println("Укажите число");
        int number2 = scanner.nextInt();
        System.out.println("Укажите степень:");
        int pow2 = scanner.nextInt();
        int result2 = getExponentiation(number2, pow2);
        System.out.println(result2);
    }
}
