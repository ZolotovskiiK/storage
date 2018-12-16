public class ArrayReverse {
    private static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int change = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = change;
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 2, 3, 8, 15};
        reverse(array);
        for (int e : array) {
            System.out.println(e);
        }
    }
}
