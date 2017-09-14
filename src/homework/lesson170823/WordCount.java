package homework.lesson170823;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("one", "one","two","two","three");

        Map<String,Long> map1 = WordCount.count(list);
        Map<String,Long> map2 = WordCount.funcCount(list);

        System.out.println(map1);
        System.out.println(map2);



    }

    public  static Map<String,Long> count(List<String> list){

        Map<String,Long> map = new HashMap<>();
        for ( String string: list) {
            Long count = map.get(string);
            map.put(string, count == null ? 1 : ++count);

        }

        return map;
    }


    public  static Map<String,Long> funcCount(List<String> list){

        return list.stream().collect(Collectors.groupingBy(s ->s,Collectors.counting()));
    }


}
