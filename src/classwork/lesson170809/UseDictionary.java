package classwork.lesson170809;

public class UseDictionary {
    public static void main(String[] args) {

        Dictionary d = new Dictionary();
        d.put("Pete","NY");
        d.put("John","Boston");
        d.put("Vasya","Moscow");


        System.out.println(d.get("Pete"));
        System.out.println(d.get("John"));
        System.out.println(d.get("Vasya"));

        d.put("Vasya", "SPB");
        System.out.println(d.get("Vasya"));

        for (Dictionary.Pair pair: d) {
            System.out.println(pair.key + ": " + pair.value);

        }


        Dictionary d1 = new Dictionary();
        d1.put(2,6);
        d1.put("Anna", 456);
        d1.put("Bob","Murka");


        for (Dictionary.Pair pair: d1) {
            System.out.println(pair.key + ": " + pair.value);

        }

        System.out.println(d1.delete("Anna"));








    }
}
