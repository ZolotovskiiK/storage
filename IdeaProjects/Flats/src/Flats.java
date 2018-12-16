import java.util.Scanner;

public class Flats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите количество подъездов ");

        int entrancesQuantity = scanner.nextInt();
        System.out.print("Укажите количество этажей ");
        int floorsQuantity = scanner.nextInt();
        System.out.print("Укажите номер квартиры ");
        int flat = scanner.nextInt();
        int floorFlats = 4;

        if (flat > entrancesQuantity * floorsQuantity * floorFlats) {
            System.out.println("Такой квартиры нет в доме");
            return;
        }
        int entranceNumber = (int) Math.ceil((double) flat / (floorsQuantity * floorFlats));
        System.out.println(entranceNumber + " подъезд");

        int floorNumber = (int) Math.ceil(((double) flat - (entranceNumber - 1) * floorsQuantity * floorFlats) / floorFlats);
        System.out.println(floorNumber + " этаж");

        int flatLocation = flat % floorFlats;
        if (flatLocation == 1) {
            System.out.println("Квартира ближняя слева");
        } else if (flatLocation == 2) {
            System.out.println("Квартира дальняя слева");
        } else if (flatLocation == 3) {
            System.out.println("Квартира дальняя справа");
        } else {
            System.out.println("Квартира ближняя справа");
        }

    }
}