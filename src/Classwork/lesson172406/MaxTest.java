package classwork.lesson172406;


import mytestframework.SimpleUnit;

public class MaxTest {

    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(MathUtils.max(10,20), 20));
        System.out.println(SimpleUnit.assertEquals(MathUtils.max(20,10), 20));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.max(10,20), 10));

        System.out.println(SimpleUnit.assertEquals(MathUtils.max(10,100), 100));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.max(10,100), 10));

        System.out.println(SimpleUnit.assertEquals(MathUtils.max(Integer.MAX_VALUE,20), Integer.MAX_VALUE));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.max(Integer.MAX_VALUE,20), 20));

        System.out.println(SimpleUnit.assertEquals(MathUtils.max(Integer.MAX_VALUE,Integer.MIN_VALUE), Integer.MAX_VALUE));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.max(Integer.MAX_VALUE,Integer.MIN_VALUE), Integer.MIN_VALUE));



    }
}
