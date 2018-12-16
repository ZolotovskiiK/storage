public class ArrayStrings {
    private static void makeUpperCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
    }

    public static void main(String[] args) {
        String[] array = {"мама", "мыла", "раму"};
        makeUpperCase(array);
        for (String e : array) {
            System.out.println(e);
        }
    }
}
