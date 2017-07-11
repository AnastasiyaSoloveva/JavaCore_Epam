package homework.array170707;



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

        list.remove("one");
        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get( 1));

        System.out.println(list.set( "six",1));
        System.out.println(list);


        System.out.println(list.set( "six",3));
        System.out.println(list);









    }
}
