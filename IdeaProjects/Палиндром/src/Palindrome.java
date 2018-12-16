public class Palindrome {
    private static boolean isPalindrome(String string) {
        int startPos = 0;
        int endPos = string.length() - 1;

        if (string.length() == 1) {
            return true;
        }
        while (startPos < endPos) {
            if (!Character.isLetter(string.charAt(startPos))) {
                startPos++;
                continue;
            }

            if (!Character.isLetter(string.charAt(endPos))) {
                endPos--;
                continue;
            }

            char firstLetter = Character.toLowerCase(string.charAt(startPos));
            char lastLetter = Character.toLowerCase(string.charAt(endPos));

            if (firstLetter != lastLetter) {
                return false;
            }

            startPos++;
            endPos--;
        }

        return true;
    }

    public static void main(String[] args) {
        String string = "Аргентина манит негра";
        isPalindrome(string);
        System.out.println(isPalindrome(string));
    }
}