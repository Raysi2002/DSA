// 3.	Reverse a String using a Stack
// 	•	Input: "hello"
// 	•	Output: "olleh"


package stackproblems;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseString(str));
    }

    static String reverseString(String str){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            stack.push(ch);
        }
        
        for(int i = 0; i < stack.size(); i++){
            result.append(stack.pop());
        }
        return result.toString();
    }
}
