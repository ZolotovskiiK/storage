public class LineBreak {
    private static int gerArraySum(String string) {
        String[] array = string.split(",");
        int sum = 0;
        for (String e : array) {
            sum += Integer.parseInt(e);
        }
        return sum;
    }

    public static void main(String[] args) {
        String string = "1,2,3,4,5";
        int result = gerArraySum(string);
        System.out.print(result);
    }
}
