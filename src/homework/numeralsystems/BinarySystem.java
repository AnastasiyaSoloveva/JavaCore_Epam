package homework.numeralsystems;


public class BinarySystem {


    public static String toBinary(int a) {
        if ( a == 0) return "0";
        String result = "";
        int b;
        while (a != 0 ){
            b = a % 2;
            result = b + result;
            a = a/2;
        }
        return result;
    }
}
