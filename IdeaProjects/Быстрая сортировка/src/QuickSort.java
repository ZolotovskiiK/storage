import java.util.Arrays;

public class QuickSort {
    private static void quickSort(int[] array, int left, int right) {
        if (left == right) {
            return;
        }

        if (right - left == 1) {
            if (array[left] > array[right]) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
            return;
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
