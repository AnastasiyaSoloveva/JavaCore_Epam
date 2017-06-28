package homework.fibonacci;


import mytestframework.SimpleUnit;

public class FibonacciTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(IsFibonacci.isFibonacci(5), true));
        System.out.println(SimpleUnit.assertEquals(IsFibonacci.isFibonacci(3), true));
        System.out.println(SimpleUnit.assertEquals(IsFibonacci.isFibonacci(1), true));
        System.out.println(SimpleUnit.assertEquals(IsFibonacci.isFibonacci(10), false));
        System.out.println(SimpleUnit.assertEquals(IsFibonacci.isFibonacci(50), false));


        System.out.println(SimpleUnit.assertNotEquals(IsFibonacci.isFibonacci(1), false));
        System.out.println(SimpleUnit.assertNotEquals(IsFibonacci.isFibonacci(50), true));

        System.out.println(SimpleUnit.assertEquals(IsFibonacci.isFibonacci(0), true));

        System.out.println(SimpleUnit.assertEquals(IsFibonacci.isFibonacci(Integer.MAX_VALUE),true));
        System.out.println(SimpleUnit.assertEquals(IsFibonacci.isFibonacci(Integer.MIN_VALUE), false));














    }
}
