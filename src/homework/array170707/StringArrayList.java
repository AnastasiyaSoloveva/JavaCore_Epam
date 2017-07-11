package homework.array170707;


import java.util.Arrays;

public class StringArrayList {

    private static final int DEFAULT_SIZE = 2;

    private String[] elements = new String[DEFAULT_SIZE];

    //свободный элемент, следующий за занятым

    private int size = 0;


    public void add(String string) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = string;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("[");

        if (elements.length > 0) {
            res.append(elements[0]);
            for (int i = 1; i < elements.length; i++) {
                if (elements[i] != null) {
                    res.append(",").append(elements[i]);

                }
            }
        }
        res.append(']');

        return res.toString();
    }

    public void remove(int i) {
        if (i >= size || i < 0) {
            return;
        }
        System.arraycopy(elements, i + 1, elements, i, size - i - 1);
        size--;
        elements[size] = null;
    }


    public void remove(String s) {
        for (int i = 0; i < elements.length; i++) {
            if (s.equals(elements[i])) {
                this.remove(i);
            }

        }
        return;
    }


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public String get(int i) {
        if (i >= size || i < 0) {
            return "";
        }
        return elements[i];
    }


    public boolean set(String string, int i) {
        if (i >= size || i < 0) {
            return false;
        }
        elements[i] = string;
        return true;
    }
}
