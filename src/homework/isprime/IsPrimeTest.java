package homework.isprime;


import mytestframework.SimpleUnit;

public class IsPrimeTest {
    public static void main(String[] args) {

        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(5), true));
        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(127), true));
        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(4), false));
        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(100), false));
        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(-5), false));


        System.out.println(SimpleUnit.assertNotEquals(IsPrime.isPrime(5), false));
        System.out.println(SimpleUnit.assertNotEquals(IsPrime.isPrime(127), false));
        System.out.println(SimpleUnit.assertNotEquals(IsPrime.isPrime(-127), true));


        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(0), false));
        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(1), false));

        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(Integer.MAX_VALUE), false));
        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(Integer.MIN_VALUE), false));





















    }
}
