package homework.fibonacci;


public class IsFibonacci {

    public static boolean isFibonacci(int a) {
        if (a <= 1 && a >= 0)
            return true;
        else {
            int fib1 = 1;
            int fib2 = 1;
            int temp;
            while (fib2 <= a) {
                if ( fib2 == a) {
                    return true;
                } else {
                    temp = fib2;
                    fib2 = fib1 + fib2;
                    fib1 = temp;
                }
            }
            return false;
        }
    }

}
