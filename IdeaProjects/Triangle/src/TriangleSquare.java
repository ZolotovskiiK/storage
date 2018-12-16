import java.util.Scanner;

public class TriangleSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите x1");
        double x1 = scanner.nextDouble();
        System.out.println("Укажите y1");
        double y1 = scanner.nextDouble();
        System.out.println("Укажите x2");
        double x2 = scanner.nextDouble();
        System.out.println("Укажите y2");
        double y2 = scanner.nextDouble();
        System.out.println("Укажите x3");
        double x3 = scanner.nextDouble();
        System.out.println("Укажите y3");
        double y3 = scanner.nextDouble();

        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));

        double epsilon = 1.0e-10;

        if (a + b - c > epsilon && b + c - a > epsilon && a + c - b > epsilon) {
            double semiPerimeter = (a + b + c) / 2;
            double square = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
            System.out.println("Площадь: " + square);
        } else {
            System.out.println("Точки лежат на одной прямой");
        }
    }
}
