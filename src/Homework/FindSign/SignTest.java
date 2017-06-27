package homework.findsign;


import mytestframework.SimpleUnit;

public class SignTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(FindSign.sign(10),1));
        System.out.println(SimpleUnit.assertEquals(FindSign.sign(100),1));
        System.out.println(SimpleUnit.assertNotEquals(FindSign.sign(-10),1));

        System.out.println(SimpleUnit.assertEquals(FindSign.sign(-100),-1));
        System.out.println(SimpleUnit.assertEquals(FindSign.sign(-1000),-1));
        System.out.println(SimpleUnit.assertEquals(FindSign.sign(Integer.MIN_VALUE),-1));
        System.out.println(SimpleUnit.assertNotEquals(FindSign.sign(Integer.MIN_VALUE),1));

        System.out.println(SimpleUnit.assertEquals(FindSign.sign(0),0));
        System.out.println(SimpleUnit.assertNotEquals(FindSign.sign(0),1));










    }
}
