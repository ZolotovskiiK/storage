import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        double operand1 = scanner.nextDouble();
        System.out.println("Ведите второе число");
        double operand2 = scanner.nextDouble();
        System.out.println("Введите номер операции");
        int command = scanner.nextInt();

        switch (command) {
            case 1:
                double sum = operand1 + operand2;
                System.out.println(sum);
                break;
            case 2:
                double subtraction = operand1 - operand2;
                System.out.println(subtraction);
                break;
            case 3:
                double multiplication = operand1 * operand2;
                System.out.println(multiplication);
                break;
            case 4:
                double division = operand1 / operand2;
                System.out.println(division);
            default:
                System.out.println("Неизвестная операция");
        }
    }
}
