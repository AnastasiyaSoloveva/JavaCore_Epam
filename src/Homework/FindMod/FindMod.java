package Homework.FindMod;


public class FindMod {

    public static int mod(int a, int b) {
        while (a - b >= 0) {
            a = a - b;
        }
        return a;
    }
}
