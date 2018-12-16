import java.util.Scanner;

public class TenNumbersInString {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 100) {
            System.out.printf("%4d", i);
            if (i % 10 == 0) {
                System.out.println();
            }
            ++i;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите X - ");
        int x = scanner.nextInt();

        System.out.println("Введите Y - ");
        int y = scanner.nextInt();

        System.out.println("Введите N - ");
        int n = scanner.nextInt();

        int count = 0;
        int j = x;

        while (j <= y) {
            ++count;
            System.out.printf("%4d", j);
            if (count % n == 0) {
                System.out.println();
            }
            ++j;
        }
    }
}
