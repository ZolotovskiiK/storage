public class MaximumSearch {
    private static double getMax(double array[]) {
        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        double[] array = {8, 5, 3, 10};

        double maxNumber = getMax(array);
        System.out.println("Максимальное число массива " + maxNumber);
    }
}
