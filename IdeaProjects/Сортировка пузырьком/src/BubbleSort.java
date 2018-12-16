public class BubbleSort {
    private static int[] getBubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                return array;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {11, 3, 14, 16, 7, 1, 12};
        int[] arr = getBubbleSort(array);
        for (int e : arr) {
            System.out.println(e);
        }
    }
}