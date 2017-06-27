package homework.numeralsystems;


import mytestframework.SimpleUnit;

public class NumeralSystemTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(BinarySystem.toBinary(10), "1010"));
        System.out.println(SimpleUnit.assertEquals(BinarySystem.toBinary(20), "10100"));
        System.out.println(SimpleUnit.assertEquals(BinarySystem.toBinary(0), "0"));
        System.out.println(SimpleUnit.assertEquals(BinarySystem.toBinary(10000), "10011100010000"));



        System.out.println(SimpleUnit.assertEquals(OctalSystem.toOctal(10), "12"));
        System.out.println(SimpleUnit.assertEquals(OctalSystem.toOctal(20), "24"));
        System.out.println(SimpleUnit.assertEquals(OctalSystem.toOctal(0), "0"));
        System.out.println(SimpleUnit.assertEquals(OctalSystem.toOctal(10000), "23420"));


        System.out.println(SimpleUnit.assertEquals(HexSystem.toHex(10), "a"));
        System.out.println(SimpleUnit.assertEquals(HexSystem.toHex(20), "14"));
        System.out.println(SimpleUnit.assertEquals(HexSystem.toHex(0), "0"));
        System.out.println(SimpleUnit.assertEquals(HexSystem.toHex(10000), "2710"));


    }
}
