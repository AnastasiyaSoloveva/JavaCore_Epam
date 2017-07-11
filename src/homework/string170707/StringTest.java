package homework.string170707;


import mytestframework.SimpleUnit;

public class StringTest {

    public static void main(String[] args) {

        String s ="    Hello  ";
        String s2 ="Hello";
        String s3 ="    Hello";
        String s4 ="Hello  ";
        String s5 ="He l l o  ";
        String s6 ="";



        System.out.println(SimpleUnit.assertEquals(StringMethodsPractice.trim(s6), ""));
        System.out.println(SimpleUnit.assertEquals(StringMethodsPractice.trim(s2), s2));
        System.out.println(SimpleUnit.assertEquals(StringMethodsPractice.trim(s4), s2));
        System.out.println(SimpleUnit.assertEquals(StringMethodsPractice.trim(s5),"He l l o"));
        System.out.println(SimpleUnit.assertEquals(StringMethodsPractice.trim(s3),s2));
        System.out.println(SimpleUnit.assertEquals(StringMethodsPractice.trim(s),s2));




    }
}
