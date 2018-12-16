import java.util.Scanner;

public class MultiplicationTable {
    private static int[][] getMultiplicationTable(int horizontalSize, int verticalSize) {
        int[][] multiplicationTable = new int[horizontalSize][verticalSize];

        for (int i = 1; i <= horizontalSize; i++) {
            for (int j = 1; j <= verticalSize; j++) {
                multiplicationTable[i - 1][j - 1] = i * j;
            }
        }
        return multiplicationTable;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите колисество столбцов таблицы: ");
        int verticalSize = scanner.nextInt();

        System.out.print("Укажите количество строк таблицы: ");
        int horizontalSize = scanner.nextInt();

        int[][] table;
        table = getMultiplicationTable(horizontalSize, verticalSize);

        for (int[] e : table) {
            for (int d : e) {
                System.out.printf("%5d", d);
            }
            System.out.println();
        }
    }
}



