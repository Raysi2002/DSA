package string;

public class StringPlaindrome {
    public static void main(String[] args) {
        String str = "Hello, world";
        System.out.println(str);
        System.out.println(isPalindrome(str));
    }
    public static StringBuffer isPalindrome(String s) {
        s = s.toLowerCase();
        String str = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch))
                str += ch;
        }
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        return sb;
    }
    
}
