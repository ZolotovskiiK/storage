import java.util.Arrays;

public class PyramidalSort {
    private static void usePyramidalSort(int[] array) {
        int lenght = array.length;
        int index = lenght / 2 - 1;

        while (index >= 0) {
            useScreening(array, index, lenght);
            index--;
        }
        while (lenght > 1) {
            int temp = array[0];
            array[0] = array[lenght - 1];
            array[lenght - 1] = temp;

            lenght--;
            useScreening(array, 0, lenght);
        }
    }

    private static void useScreening(int[] array, int index, int lenght) {
        while (index <= (lenght / 2 - 1)) {
            int maxElement = index;
            int leftElement = 2 * index + 1;
            int rightElement = 2 * index + 2;

            if (leftElement < lenght && array[index] < array[leftElement]) {
                maxElement = leftElement;
            }
            if (rightElement < lenght && array[maxElement] < array[rightElement]) {
                maxElement = rightElement;
            }
            if (array[index] < array[maxElement]) {
                int temp = array[index];
                array[index] = array[maxElement];
                array[maxElement] = temp;

                index = maxElement;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 3, 15, 1, 4, 6, 9};
        usePyramidalSort(array);
        System.out.println(Arrays.toString(array));
    }
}
