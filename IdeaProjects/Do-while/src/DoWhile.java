public class DoWhile {
    public static void main(String[] args) {
        int a = 2;
        int b = 21;
        int i = a;
        int sum = 0;
        int count = 0;
        do {
            sum += i;
            ++i;
            ++count;
        } while (i <= b);
        double arithmeticalMean = (double) sum / count;
        System.out.println("Среднее арифметическре - " + arithmeticalMean);

        int j = a;
        int count1 = 0;
        int sum1 = 0;
        do {
            if (j % 2 == 0) {
                sum1 += j;
                ++count1;
            }
            ++j;
        } while (j <= b);
        double arithmeticalMean1 = (double) sum1 / count1;
        System.out.println("Среднее арифметическое только четных чисел - " + arithmeticalMean1);
    }
}

