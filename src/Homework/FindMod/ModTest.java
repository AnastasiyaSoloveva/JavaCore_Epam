package Homework.FindMod;


import Classwork.lesson172406.SimpleUnit;

public class ModTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(FindMod.mod(10,7),3));
        System.out.println(SimpleUnit.assertEquals(FindMod.mod(13,6),1));
        System.out.println(SimpleUnit.assertEquals(FindMod.mod(112,10),2));

        System.out.println(SimpleUnit.assertNotEquals(FindMod.mod(13,6),2));




    }
}
