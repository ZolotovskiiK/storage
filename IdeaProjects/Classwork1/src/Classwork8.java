public class Classwork8 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 100; ++i) {
            stringBuilder.append(i).append(", ");
        }

        String result = stringBuilder.toString();
        System.out.println(result);
    }
}
