public class InsertionSort {
    private static int[] getInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 1, 3, 6};
        int[] arr = getInsertionSort(array);
        for (int e : arr) {
            System.out.println(e);
        }
    }
}
