package stackproblems;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "()[]{}[][({})]";
        System.out.println(validParenthesis(s));
    }

    static boolean validParenthesis(String s){
        Stack<Character> stack = new Stack<>();
        for(int i  = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty())
                    return false;
                char ch = stack.peek();
                if(s.charAt(i) == ')' && ch == '(' || s.charAt(i) == ']' && ch == '[' || s.charAt(i) == '}' && ch == '{'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
