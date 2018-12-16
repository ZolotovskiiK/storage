public class MaximumSubstring {
    private static int getMaximumSubstring(String string) {
        if (string.length() == 0) {
            return 0;
        }
        int counterSubstring = 1;
        int maximumSubstring = 0;

        for (int i = 0; i < string.length() - 1; i++) {
            char s = string.charAt(i);
            if (Character.toLowerCase(s) == Character.toLowerCase(string.charAt(i + 1))) {
                counterSubstring++;
            } else {
                if (counterSubstring > maximumSubstring) {
                    maximumSubstring = counterSubstring;
                }
                counterSubstring = 1;
            }
        }
        if (counterSubstring > maximumSubstring) {
            maximumSubstring = counterSubstring;
        }
        return maximumSubstring;
    }

    public static void main(String[] args) {
        String string = "FfffssDDDDDDDdaYyyyyyyyy";
        int substring = getMaximumSubstring(string);
        System.out.print(substring);
    }
}