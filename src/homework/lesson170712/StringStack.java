package homework.lesson170712;

public class StringStack {


    private String[] elements;
    private int size;
    private static final int DEFAULT_MAX_SIZE = 3;


    public StringStack() {
        this(DEFAULT_MAX_SIZE);
    }


    public StringStack(int maxSize) {
        this.elements = new String[maxSize];
        this.size = 0;
    }


}

