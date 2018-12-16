public class SortingCheck {
    private static boolean isAscenndingSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDecreaseSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arrayAscending = {1, 2, 3, 4, 5, 6};
        boolean ascending = isAscenndingSort(arrayAscending);
        if (ascending) {
            System.out.println("Массив отсортирован по возрастанию");
        } else {
            System.out.println("Массив не отсортирован");
        }

        int[] arrayDecrease = {6, 5, 4, 3, 2, 1};
        boolean decrease = isDecreaseSort(arrayDecrease);
        if (decrease) {
            System.out.println("Массив отсортирован по убыванию");
        } else {
            System.out.println("Массив не отсортирован");
        }
    }
}
