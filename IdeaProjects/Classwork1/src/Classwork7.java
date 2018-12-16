public class Classwork7 {
    private static int binarySorting(int[] array, int left, int right, int x) {

        if (left > right) {
            return -1;
        }
        left = 0;
        right = array.length - 1;
        int middle = (right + left) / 2;
        if (middle == x) {
            return middle;
        } else if (x > middle) {
            left = middle + 1;
            return binarySorting(array, left, right, x);
        } else {
            right = middle - 1;
            return binarySorting(array, left, right, x);
        }

    }


    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 8, 10, 15};
        int c = binarySorting(array,0,array.length-1,2 );
        System.out.println(c);
    }

}