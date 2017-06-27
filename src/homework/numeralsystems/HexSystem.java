package homework.numeralsystems;


public class HexSystem {

    public static String toHex(int a) {
        if ( a == 0) return "0";
        String result = "";
        int b;
        char c = '\u0000';
        while (a != 0 ){
            b = a % 16;
            b = a % 16;
            if (b > 9) {
                if (b == 10) {
                    c = 'a'; // a
                }
                if (b == 11) {
                    c = 'b'; //b
                }
                if (b == 12) {
                    c = 'c'; //c
                }
                if (b == 13) {
                    c = 'd'; //d
                }
                if (b == 14) {
                    c = 'e'; //e
                }
                if (b == 15) {
                    c = 'f'; //f
                }
                result = c + result;

            } else {
                result = b + result;

            }
            a = a/16;

        }
        return result;
    }


}
