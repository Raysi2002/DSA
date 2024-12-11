package hashmap.problems;

import java.util.*;

// (VVIP fro HashMap)

public class ItineraryFromTickets {
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chenni", "Goa");
        tickets.put("Goa", "Delhi");
        tickets.put("Mumbai", "Chenni");
        tickets.put("Delhi", "Chandigarh");
        start(tickets);
    }

    public static void start (HashMap<String, String> tickets){
        String start = null;

        HashMap<String, String> revMap = new HashMap<>();

        for(String key : tickets.keySet()){
            revMap.put(tickets.get(key), key);
        }

        for(String key : revMap.keySet()){
            if(!revMap.containsKey(key))
                start = key;
        }
        System.out.println(tickets);
        System.out.println(revMap);
        System.out.println(start);
    }
}
