package codingbat;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

    public Map<String, String> pairs(String[] strings) {
        Map<String,String> map = new HashMap<>();
        for(String s: strings){
            map.put(s.substring(0,1), s.substring(s.length()-1, s.length()));
        }

        return map;

    }



    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String s: strings){
            if(!map.containsKey(s)){
                map.put(s, 1);
            }else{
                int count = map.get(s);
                map.put(s,count+1);
            }
        }

        return map;


    }


    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for(String s: strings){
            String key = s.substring(0,1);
            if(!map.containsKey(key)){
                map.put(key,s);
            } else{
                String res = map.get(key);
                map.put(key, res+s);
            }
        }

        return map;

    }

    public String wordAppend(String[] strings) {
        String res = "";
        Map<String, Integer> map = new HashMap<>();
        for(String s: strings){
            if(!map.containsKey(s)){
                map.put(s, 1);
            }else{
                int count = map.get(s);
                map.put(s,count+1);
            }
            if(map.get(s) % 2 == 0){
                res+=s;
            }

        }

        return res;

    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Boolean> mapBool = new HashMap<>();

        for(String s: strings){
            if(!map.containsKey(s)){
                map.put(s, 1);
            }else{
                int count = map.get(s);
                map.put(s,count+1);
            }

            if(map.get(s) >=2){
                mapBool.put(s,true);
            }else{
                mapBool.put(s,false);
            }
        }


        return mapBool;

    }

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String s: strings){
            if(!map.containsKey(s)){
                map.put(s,0);
            }
        }

        return map;

    }


    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String s: strings){
            if(!map.containsKey(s)){
                map.put(s, s.length());
            }
        }
        return map;

    }




}
