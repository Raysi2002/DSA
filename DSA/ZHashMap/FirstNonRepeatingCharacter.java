// 2. Find the First Non-Repeating Character
// 	•	Problem: Given a string, find the first non-repeating character.
// 	•	Example:

// Input: "swiss"
// Output: 'w'

package ZHashMap;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        System.out.println(firstNonRepeatingCharacter(str));
        System.out.println(firstNonRepeatingCharacterApproach2(str));
    }

    public static char firstNonRepeatingCharacter(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for(int i = 0; i < str.length(); i++){
            if(map.get(str.charAt(i)) == 1){
                return str.charAt(i);
            }
        }
        return 'z';
    }

    public static char firstNonRepeatingCharacterApproach2(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if(map.get(ch) == 1) return ch;  
        }

        return '1';
    }
}
