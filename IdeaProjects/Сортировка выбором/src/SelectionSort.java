public class SelectionSort {
    private static void useSelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 24, 13, 6, 1, 17, 3};
        useSelectionSort(array);
        for (int e : array) {
            System.out.println(e);
        }
    }
}
