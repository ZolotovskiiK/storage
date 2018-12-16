import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = scanner.nextInt();
        System.out.println("Введите второе число");
        int y = scanner.nextInt();

        int max = (x > y) ? x : y;
        System.out.println("Max= " + max);
        int min = (x < y) ? x : y;
        System.out.println("Min= " + min);

        if (x > y) {
            System.out.println("Max= " + x);
            System.out.println("Min= " + y);
        } else {
            System.out.println("Max = " + y);
            System.out.println("Min = " + x);
        }
    }
}
