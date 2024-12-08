package hashmap.basics;

import java.util.*;

public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<String, String> hMap = new HashMap<>();
        HashMap<String, String> rayInfo = new HashMap<>();

        map.put(571, "Aashish");
        map.put(572, "Nandani");
        map.put(573, "Sai");
        map.put(571, "Aashish");
        map.put(571, "Aashish");
        map.put(572, "Nandani");
        map.put(573, "Sai");
        map.put(571, "Aashish");
        map.put(116, "Kanxu");
        map.put(571, "Ray");

        hMap.put("name", "Aashish");
        hMap.put("college", "GIET");
        hMap.put("Tech", "Web_Dev");
        hMap.put("Language", "Java");
        hMap.put("CGPA", "8.88");

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(hMap);

        rayInfo.putAll(hMap);
        System.out.println(rayInfo);
        // TreeSet<Integer> set = map.entrySet();
        // System.out.println(set);
        for(String key : rayInfo.keySet()){
            // System.out.println("Key: " + key + "\tValue: " + rayInfo.get(key));
            System.out.println(key + " : " + rayInfo.get(key));

        }

    }
}
