public class Classwork {
    public static void main(String[] args) {

        for (int i = 100; i > 1; i--) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        int n = 7;
        for (int i = 1; i <= n; i++) {

            System.out.println(Math.pow(i, 2));
        }
        int count = 0;
        int sum = 0;
        for (int j = 3; j <= 21; ++j ) {
            if (j % 2 == 0) {
                count++;
                sum += j;
            }
        }
            double arithmetical = (double) sum/count;
            System.out.println(arithmetical);
        }
    }