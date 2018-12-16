import java.util.Scanner;

public class Deposit {
    private static double calculateDeposit(double deposit, int depositTerm, double percent) {
        int yearPercent = 12;
        double depositSum = deposit;
        double monthPercent = percent / yearPercent;
        int allPercent = 100;

        for (int i = 1; i <= depositTerm; i++) {
            double totalSum = depositSum * monthPercent / allPercent;
            depositSum += totalSum;
        }
        return depositSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада: ");
        double deposit = scanner.nextDouble();

        System.out.println("Введите количество месяцев: ");
        int depositTerm = scanner.nextInt();

        System.out.println("Введите процент: ");
        int percent = scanner.nextInt();

        double result = calculateDeposit(deposit, depositTerm, percent);
        double profit = result - deposit;

        System.out.println("Итоговая сумма " + result);
        System.out.println("Прибыль " + profit);
    }
}
