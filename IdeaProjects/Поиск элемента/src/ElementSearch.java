import java.util.Scanner;

public class ElementSearch {
    private static int getElementSearch(int array[], int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите число: ");

        int number = scanner.nextInt();
        int[] array = {1, 4, 7, 9, 3};

        int element = getElementSearch(array, number);
        System.out.println(element);
    }
}

