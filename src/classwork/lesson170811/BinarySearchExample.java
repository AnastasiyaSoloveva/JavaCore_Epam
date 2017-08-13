package classwork.lesson170811;

import java.util.*;

public class BinarySearchExample {

    public static void main(String[] args) {

        A a = new A();

        System.out.println("ArrayList");
        long start = System.nanoTime();
        List<A> arrayList = new ArrayList<>();
        arrayList = (ArrayList<A>)add(arrayList);
        sort(arrayList);
        search(arrayList, a);
        long stop = System.nanoTime();
        System.out.println("Total time for ArrayList: " +  (stop - start));
        System.out.println();


        System.out.println("LinkedList");
        start = System.nanoTime();
        List<A> linkedList = new LinkedList<>();
        linkedList = (LinkedList<A>)add(linkedList);
        sort(linkedList);
        search(linkedList, a);
        stop = System.nanoTime();
        System.out.println("Total time for LinkedList: " +  (stop - start));
        System.out.println();


        System.out.println("TreeSet");
        start = System.nanoTime();
        Set<A> set = new TreeSet<>();
        set = (TreeSet<A>)add(set);
        long start_search = System.nanoTime();
        set.contains(a);
        long stop_search = System.nanoTime();
        System.out.println("Searching time: "  + (stop_search - start_search));
        stop = System.nanoTime();
        System.out.println("Total time for TreeSet: " +  (stop - start));



    }

    public static Collection<A> add(Collection<A> collection){
        long start = System.nanoTime();
        for (int i = 0; i < 1000000 ; i++) {
            collection.add(new A());
        }
        long stop = System.nanoTime();
        System.out.println("Adding time: " +   (stop - start));

        return collection;

    }


    public static boolean search(List<A> list, A element){
        long start = System.nanoTime();
        int index = Collections.binarySearch(list, element);
        long stop = System.nanoTime();
        System.out.println("Searching time: "  + (stop - start));
        return true;
    }


    public static void sort(List<A> list){
        long start = System.nanoTime();
        Collections.sort(list);
        long stop = System.nanoTime();
        System.out.println("Sorting time: "  + (stop - start));

    }


}


class A implements Comparable<A> {
    static Random r = new Random(7);
    int x = r.nextInt(1000000);

    @Override
    public String toString() {
        return Integer.toString(x);
    }

    @Override
    public int compareTo(A other) {
        return x - other.x;
    }


}
