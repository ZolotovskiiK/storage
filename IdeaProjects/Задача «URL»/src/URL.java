public class URL {
    private static String getURL(String text) {
        int index = text.indexOf("://") + 3;
        int lastIndex = text.indexOf("/", index);

        if (lastIndex != -1) {
            return (text.substring(index, lastIndex));
        } else {
            return text.substring(index);
        }
    }

    public static void main(String[] args) {
        System.out.println(getURL("http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf"));
        System.out.println(getURL("http://SomeServerName"));
    }
}
