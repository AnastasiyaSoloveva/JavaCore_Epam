package homework.array170707;


import homework.array170707.StringArrayList;

/**
 * Created by glokkolt on 07.07.17.
 */
public class UseStringArrayList {

    public static void main(String[] args) {

        StringArrayList list = new StringArrayList();

        list.add("one");
        System.out.println(list);

        list.add("two");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.add("three");

        System.out.println(list);
        list.add("four");
        list.add("five");

        System.out.println(list);

        list.remove(2);

        System.out.println(list);





    }
}
