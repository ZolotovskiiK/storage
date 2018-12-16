import java.util.Scanner;

public class TemperatureConversion {
    private static double getKelvin(double degreesCelsius) {
        return degreesCelsius + 273.15;
    }

    private static double getFahrenheit(double degreesCelsius) {
        return 1.8 * degreesCelsius + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите градусы по шкале Цельсия: ");
        double degreesCelsius = scanner.nextDouble();

        double degreesKelvin = getKelvin(degreesCelsius);
        double degreesFahrenheit = getFahrenheit(degreesCelsius);

        System.out.println("Ваши градусы " + degreesKelvin + " по шкале Кельвина");
        System.out.println("Ваши градусы " + degreesFahrenheit + " по шкале Фаренгейта");
    }
}
