import java.util.Arrays;

public class Test {
    private static void getBubbleSorting(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            boolean sorting = true;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sorting = false;
                }
            }
            if (sorting) {
                return ;
            }
        }

    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 5, 7};
         getBubbleSorting(array);
        System.out.println(Arrays.toString(array));
    }
}
