public class Overload {
    private static int getTypeSize(double x) {
        return 8;
    }

    private static int getTypeSize(long x) {
        return 8;
    }

    private static int getTypeSize(int x) {
        return 4;
    }

    private static int getTypeSize(float x) {
        return 4;
    }

    private static int getTypeSize(short x) {
        return 2;
    }

    private static int getTypeSize(byte x) {
        return 1;
    }

    public static void main(String[] args) {
        int a = getTypeSize(412.73);
        System.out.println(a);

        int b = getTypeSize((long) 1584582485);
        System.out.println(b);

        int c = getTypeSize(112);
        System.out.println(c);

        int d = getTypeSize(214.6f);
        System.out.println(d);

        int e = getTypeSize((short) 115);
        System.out.println(e);

        int f = getTypeSize((byte) 4);
        System.out.println(f);


    }
}
