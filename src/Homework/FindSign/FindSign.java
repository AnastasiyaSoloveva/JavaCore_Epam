package Homework.FindSign;


public class FindSign {


    public static int sign(int i) {
        if (i == 0) {
            return 0;
        }

        return i > 0 ? 1 : -1;
    }
}
