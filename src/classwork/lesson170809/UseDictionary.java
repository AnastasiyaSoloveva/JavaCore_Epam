package classwork.lesson170809;

public class UseDictionary {
    public static void main(String[] args) {

        Dictionary<String,String> d = new Dictionary();
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


        Dictionary<String, Integer> d1 = new Dictionary();
        d1.put("John",789);
        d1.put("Anna", 456);
        d1.put("Bob",123);


        for (Dictionary.Pair pair: d1) {
            System.out.println(pair.key + ": " + pair.value);

        }

        System.out.println(d1.delete("Anna"));










    }
}
