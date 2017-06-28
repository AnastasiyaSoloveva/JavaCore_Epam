package homework.findmod;


import mytestframework.SimpleUnit;

public class ModTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(FindMod.mod(10,7),3));
        System.out.println(SimpleUnit.assertEquals(FindMod.mod(13,6),1));
        System.out.println(SimpleUnit.assertEquals(FindMod.mod(112,10),2));

        System.out.println(SimpleUnit.assertNotEquals(FindMod.mod(13,6),2));

        System.out.println(SimpleUnit.assertEquals(FindMod.mod(-10,7),3));
        System.out.println(SimpleUnit.assertEquals(FindMod.mod(13,-6),1));
        System.out.println(SimpleUnit.assertEquals(FindMod.mod(-112,-10),2));

        System.out.println(SimpleUnit.assertEquals(FindMod.mod(0,10),0));
        System.out.println(SimpleUnit.assertNotEquals(FindMod.mod(0,10),10));










    }
}
