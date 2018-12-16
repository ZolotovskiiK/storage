import java.util.Scanner;

public class DigitsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите число: ");
        int number = scanner.nextInt();
        int oddNumbersSum = 0;
        int sum = 0;
        int maxDigit = number % 10;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;

            if (digit % 2 != 0) {
                oddNumbersSum += digit;
            }

            if (digit > maxDigit) {
                maxDigit = digit;
            }
            number /= 10;
        }
        System.out.println("Сумма цифр в числе = " + sum);
        System.out.println("Сумма нечетных цифр в числе = " + oddNumbersSum);
        System.out.println("Максимальная цифра числа " + maxDigit);
    }
}

