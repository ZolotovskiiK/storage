public class Classwork3 {
    private static double getCalc(int x, int y) {
        return 3 * x + 4 * y;
    }

    private static double getAverage(int begin, int end) {
        int count = 0;
        int sum = 0;
        for (int i = begin; i <= end; i++) {
            sum += i;
            count++;
        }
        return (double) sum / count;

    }

    public static void main(String[] args) {
        Double calc = Classwork3.getCalc(3, 4);
        System.out.println(calc);

        double calc1 = getCalc(2,15);
        System.out.println(calc1);

        double calc2 = getAverage(1,17);
        System.out.println(calc2);

        double calc3 = getAverage(2,15);
        System.out.println(calc3);
    }
}
