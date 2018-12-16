import java.util.Scanner;

public class BinarySearch {
    private static int useBinarySearch(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == x) {
                return middle;
            } else if (x < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите число: ");

        int[] array = {2, 5, 9, 13, 15, 17, 20};
        int x = scanner.nextInt();

        int index = useBinarySearch(array, x);
        System.out.println("Указанное вами число соответствует индексу: " + index);
    }
}
