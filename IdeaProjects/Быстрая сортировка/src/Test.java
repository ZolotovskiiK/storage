import java.util.Arrays;

public class Test {
    private static void quickSort(int[] array, int left, int right) {
        if (array.length == 1) {
            return;
        }
        if (array.length == 2) {
            if (array[0] > array[1]) {
                int temp = array[0];
                array[0] = array[1];
                array[1] = temp;
                return;
            } else {
                return;
            }
        }

        int middle = (left + right) / 2;
        int x = array[middle];

        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < x) {
                i++;
            }

            while (array[j] > x) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (left < j) {
            quickSort(array, left, j);
        }

        if (right > i) {
            quickSort(array, i, right);
        }

    }

    public static void main(String[] args) {
        int[] array = {25, 1, 4, 17, 14, 2, 3, 11};
        int left = 0;
        int right = array.length - 1;
        quickSort(array, left, right);
        System.out.print(Arrays.toString(array));
    }
}
