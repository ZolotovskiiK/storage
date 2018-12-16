public class TEST {

    static boolean f( boolean a, boolean b, boolean c ) {
        return ( a & (! b) ) | c;
    }
    static boolean g( boolean a, boolean b, boolean c ) {
        return !a | !b | !c;
    }

    static boolean  h( boolean a, boolean b, boolean c ) {
        return a | ! b;
    }

    static String s( boolean a ) {
        // return ((a==true)?  "T":  "F" );   // use this if you want T and F output
        return ((a==true)?  "1":  "0" );
    }

    public static void main( String[] args ) {
        System.out.println( "  a  b  c  |  f  g  h" );
        System.out.println( "-----------+---------" );
        for (int a =0; a <= 1; a++ )
            for (int b=0; b <= 1; b++ )
                for (int c=0; c<=1; c++ ) {
                    boolean aa = (a==1)? true: false;
                    boolean bb = (b==1)? true: false;
                    boolean cc = (c==1)? true: false;
                    System.out.println(
                            String.format( "%3s%3s%3s  |%3s%3s%3s",
                                    s(aa), s(bb), s(cc),
                                    s(f( aa, bb, cc )),
                                    s(g( aa, bb, cc )),
                                    s(h( aa, bb, cc )) ) );
                }
    }

}

