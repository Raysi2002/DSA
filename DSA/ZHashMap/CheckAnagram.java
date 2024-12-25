// 5. Check for Anagram
// 	•	Problem: Check if two strings are anagrams (contain the same characters in the same frequency).
// 	•	Example:

// Input: "listen", "silent"
// Output: true

import java.util.HashMap;

public class CheckAnagram {
    public static void main(String[] args) {


        String str1 = "listen";
        String str2 = "silent";


        System.out.println(checkAnagram(str1, str2));
    }

    static boolean checkAnagram(String str1, String str2){
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        if(str1.length() != str2.length())
            return false;

        for(int i = 0; i < str1.length(); i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            map1.put(ch1, map1.getOrDefault(ch1, 0) + 1);
            map2.put(ch2, map2.getOrDefault(ch2, 0) + 1);
        }
        return map1.equals(map2);
    }
}
