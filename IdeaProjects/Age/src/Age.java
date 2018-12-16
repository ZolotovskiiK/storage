import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите ваш возраст: ");
        int age = scanner.nextInt();

        if (age < 1) {
            System.out.println("Вы слишком малы!");
            return;
        }
        if (age > 112) {
            System.out.println("Вы слишком стары!");
            return;
        }
        if (age % 10 == 0 || age % 10 >= 5 || (age % 100 >= 10 && age % 100 <= 19)) {
            System.out.println("Вам " + age + " лет!");
        } else if (age % 10 >= 2 && age % 10 <= 4) {
            System.out.println("Вам " + age + " года!");
        } else {
            System.out.println("Вам " + age + " год!");
        }
    }
}
