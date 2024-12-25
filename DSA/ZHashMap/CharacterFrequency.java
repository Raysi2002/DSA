// 1. Count the Frequency of Characters
// 	•	Problem: Given a string, count the frequency of each character.
// 	•	Example:

// Input: "aabbcc"
// Output: {a=2, b=2, c=2}

import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "aabbcc";
        CharacterFrequency characterFrequency = new CharacterFrequency();
        System.out.println(characterFrequency.countFrequency(str));
        
    }

    public HashMap<Character, Integer> countFrequency(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }
}
