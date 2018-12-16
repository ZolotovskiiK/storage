public class Circle {
    public static void main(String[] arg) {
        // Первая окружность
        int radius1 = 5;
        double square1 = Math.PI * Math.pow(radius1, 2);
        double length1 = 2 * Math.PI * radius1;
        System.out.println("Площадь первой окружности = " + square1);
        System.out.println("Длина первой окружности = " + length1);

        // вторая окружность
        int square2 = 26;
        double radius2 = Math.sqrt(square2 / Math.PI);
        System.out.println("Радиус второй окружности = " + radius2);

        // третья окружность
        double radius3 = 10.2;
        double angle3 = 45;
        double area3 = Math.PI * Math.pow(radius3, 2) * angle3 / 360;
        System.out.println("Площадь сектора третьей оеружности = " + area3);

        // класс Math
        double x = Math.PI * Math.E / Math.pow(2, 2) + Math.abs(-4.15);
        System.out.println("x = " + x);

        double y = Math.log(32) * Math.log10(7);
        System.out.println("y = " + y);
    }
}
