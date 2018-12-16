public class Average {
    public static void main(String[] args) {
        int a = 2;
        int b = 21;
        int i = a;
        int sum = 0;
        int count = 0;

        while (i <= b) {
            sum += i;
            ++i;
            ++count;
        }
        double arithmeticalMean = (double) sum / count;
        System.out.println("Среднее арифметическое - " + arithmeticalMean);

        int j = a;
        int count1 = 0;
        int sum1 = 0;
        while (j <= b) {
            if (j % 2 == 0) {
                sum1 += j;
                ++count1;
            }
            ++j;
        }
        double arithmeticalMean2 = (double) sum1 / count1;
        System.out.println("Среднее арифметическое только четных чисел - " + arithmeticalMean2);
    }
}
