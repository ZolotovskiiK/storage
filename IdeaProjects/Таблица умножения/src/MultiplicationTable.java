public class MultiplicationTable {
    public static void main(String[] args) {
        int tableSize = 10;
        System.out.printf("%2s", " ");
        for (int i = 1; i <= tableSize; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println();
        System.out.print(" ");

        for (int i = 0; i <= tableSize * 5; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 1; i <= tableSize; i++) {
            System.out.printf("%2d", i);
            for (int j = 1; j <= tableSize; j++) {
                int result = i * j;
                System.out.printf("%5d", result);
            }
            System.out.println();
        }
    }
}
