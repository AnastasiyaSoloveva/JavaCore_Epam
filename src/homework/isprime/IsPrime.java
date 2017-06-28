package homework.isprime;


public class IsPrime {

    public static boolean isPrime(int a) {
        if (a < 2) return false;
        for (int i = 2; i*i <= a; i++)
            if (a % i == 0) return false;
        return true;
    }


}
