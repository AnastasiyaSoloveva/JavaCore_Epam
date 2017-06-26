package Classwork.lesson172406;


public class MinTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(MathUtils.min(10,20),10));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.min(10,20),20));

        System.out.println(SimpleUnit.assertEquals(MathUtils.min(-10,20),-10));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.min(-10,20),20));

        System.out.println(SimpleUnit.assertEquals(MathUtils.min(Integer.MAX_VALUE,20),20));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.min(Integer.MAX_VALUE,20),Integer.MAX_VALUE));

    }

}
