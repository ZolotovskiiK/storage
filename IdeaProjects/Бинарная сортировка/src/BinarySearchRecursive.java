import java.util.Scanner;

public class BinarySearchRecursive {
    private static int getBinarySearchRecursive(int[] array, int left, int right, int x) {
        if (left > right) {
            return -1;
        }
        int middle = (right + left) / 2;

        if (array[middle] == x) {
            return middle;
        } else if (x < array[middle]) {
            right = middle - 1;
            return getBinarySearchRecursive(array, left, right, x);
        } else {
            left = middle + 1;
            return getBinarySearchRecursive(array, left, right, x);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите число: ");

        int x = scanner.nextInt();
        int[] array = {1, 2, 4, 6, 8, 10, 15};
        int index = getBinarySearchRecursive(array, 0, array.length - 1, x);

        System.out.println("Увказанному вами числу соответствует индекс: " + index);
    }
}