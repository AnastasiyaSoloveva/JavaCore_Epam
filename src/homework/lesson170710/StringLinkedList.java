package homework.lesson170710;


public class StringLinkedList {

    Node first;

    Node last;

    int size;

    public void add(String value) {
        Node node = new Node(value, null);

        if (first == null) {
            first = node;
        } else {
            last.next = node;
        }
        last = node;
        size++;

    }

    public boolean remove(String value) {
        boolean result = false;

        Node current = first;

        Node prev = null;

        while (current != null) {
            if (current.value.equals(value)) {
                if (prev == null) {
                    first = current.next;
                } else {
                    prev.next = current.next;

                }
                size--;
                result = true;
                break;
            }
            prev = current;
            current = current.next;

        }

        if (first == null) {
            last = null;
        }

        return result;
    }


    public String remove (int index){
        if(index > size) {
            return "";
        }

        Node prev = null;

        int count = 0;
        String value = "";
        for (Node current = first; current!= null ; current = current.next) {
            count++;
            if (count == index){
                if (prev == null) {
                    first = current.next;
                } else {
                    prev.next = current.next;

                }
                value = current.value;
                size--;
                break;
            }
            prev = current;
        }

        if (first == null) {
            last = null;
        }

        return value;
    }


    @Override
    public String toString() {
        //traverse
        StringBuilder sb = new StringBuilder("[");

        if (first != null) {
            sb.append(first.value);
            Node current = first.next;

            while (current != null) {
                sb.append(", ").append(current.value);
                current = current.next;
            }

        }

        sb.append("]");
        return sb.toString();
    }
}
