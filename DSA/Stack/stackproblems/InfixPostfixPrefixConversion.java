package stackproblems;

import java.util.Stack;

public class InfixPostfixPrefixConversion{
    public static void main(String[] args) {
        // String infix = "(A+B*C)^(D-E/F)";
        String infix =  "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(toPostfix(infix));
        System.out.println(toPrefix(infix));
    }
    
    // Infix to Postfix
    static String toPostfix(String infix){
        String result = "";
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < infix.length(); i++){
            char ch = infix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result += ch;
            }else if(ch == '('){
                stack.push(ch);
            }else if(ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    result += stack.pop();
                }
                stack.pop();
            }else{
                while(!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())){
                    result += stack.pop();
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty())
                result += stack.pop();
        return result;
    }

    //Infix to Prefix
    static String toPrefix(String str){
        String reversed = reverse(str);
        reversed = reversed.replace('(', '#').replace(')', '(').replace('#', ')');
        String postfix = toPostfix(reversed);
        return reverse(postfix);

    }


    //Common for all
    // Precedence
    static int precedence(char operator){
        if(operator == '^')
            return 3;
        else if(operator == '*' || operator == '/')
            return 2;
        else if(operator == '+' || operator == '-')
            return 1;
        else
            return -1;
    }

    static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}