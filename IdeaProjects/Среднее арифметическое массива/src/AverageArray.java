public class AverageArray {
    private static double getAverageArray(int[] array) {
        int count = 0;
        int sum = 0;
        for (int e : array) {
            if (e % 2 == 0) {
                count++;
                sum += e;
            }
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        int[] array = {3, 15, 8, 12, 26};
        double average = getAverageArray(array);
        System.out.println("Среднее арифметическое массива: " + average);
    }
}
