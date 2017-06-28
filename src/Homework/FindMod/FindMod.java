package homework.findmod;


public class FindMod {

    public static int mod(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (a - b >= 0) {
            a = a - b;
        }
        return a;
    }
}
