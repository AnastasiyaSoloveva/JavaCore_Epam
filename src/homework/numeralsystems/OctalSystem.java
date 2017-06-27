package homework.numeralsystems;


public class OctalSystem {


    public static String toOctal(int a) {
        if ( a == 0) return "0";
        String result = "";
        int b;
        while (a != 0 ){
            b = a % 8;
            result = b + result;
            a = a/8;
        }
        return result;
    }
}
