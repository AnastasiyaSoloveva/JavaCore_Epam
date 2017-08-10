package classwork.lesson170809;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Dictionary implements Iterable<Dictionary.Pair> {

    private static final int MAX = 10;

    public static class Pair<T> {
        public  Pair(T key2, T value2) {
            key = key2;
            value = value2;
        }

        T key;
        T value;
    }

    List<Pair>[] data = new List[MAX];

    public  <T> void put(T key, T value) {
        int index = hash(key);
        if (data[index] == null) {
            data[index] = new ArrayList<>();
        }

        Pair pair = getPair(key);

        if (pair == null) {
            data[index].add(new Pair(key, value));
            return;
        }

        pair.value = value;

    }


    public <T> T get(T key) {
        Pair pair = getPair(key);
        return pair == null ? null : (T)pair.value;
    }


    public  <T> boolean delete(T key) {
        int index = hash(key);
        if (data[index] != null) {
            for (Pair pair : data[index]) {
                if (pair.key.equals(key)) {
                    data[index].remove(pair);
                    return true;
                }
            }
        }
        return false;
    }



    private <T> int hash(T key) {
        return key.hashCode() & 0x7FFFFFFF % data.length;
    }






    private <T> Pair getPair(T key) {
        int index = hash(key);
        List<Pair> list = data[index];
        if (list == null) { // guard condition
            return null;
        }
        for (Pair pair : list) {
            if (pair.key.equals(key)) {
                return pair;
            }
        }

        return null;
    }


    @Override
    public Iterator<Pair> iterator() {
        return new Iterator<Dictionary.Pair>() {
            int currentElement = -1;
            Iterator<Pair> listIterator = null;

            @Override
            public boolean hasNext() {

                if (listIterator != null && listIterator.hasNext()) {
                    return true;
                }

                listIterator = null;

                for (++currentElement; listIterator == null
                        && currentElement < data.length; currentElement++) {

                    List<Pair> list = data[currentElement];

                    if (list == null) {
                        continue;
                    }

                    listIterator = list.iterator();
                    if (!listIterator.hasNext()) {
                        continue;
                    }
                    return listIterator.hasNext();
                }

                return false;
            }

            @Override
            public Pair next() {
                if (!hasNext()) {
                    throw new IllegalArgumentException();
                }
                return listIterator.next();
            }
        };
    }

}