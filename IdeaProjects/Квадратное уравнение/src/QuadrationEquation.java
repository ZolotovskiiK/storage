import java.util.Scanner;

public class QuadrationEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите переменную а:");
        double a = scanner.nextDouble();
        System.out.print("Укажите переменную b:");
        double b = scanner.nextDouble();
        System.out.print("Укажите переменную c:");
        double c = scanner.nextDouble();
        double epsilon = 10e-10;

        if (Math.abs(a) > epsilon) {
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            if (discriminant > epsilon) {
                double x1 = (-b + Math.sqrt(discriminant) / (2 * a));
                double x2 = (-b - Math.sqrt(discriminant) / (2 * a));
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (Math.abs(discriminant) <= epsilon) {
                double x = -b / (2 * a);
                System.out.println("x = " + x);
            } else {
                System.out.println("Корней нет");
            }
        } else {
            if (Math.abs(b) > epsilon) {
                double x = -c / b;
                System.out.println("x = " + x);
            }else if(Math.abs(c)>epsilon){
                System.out.println("Корней нет");
            }else{
                System.out.println("x = любому значению");
            }
        }
    }
}
