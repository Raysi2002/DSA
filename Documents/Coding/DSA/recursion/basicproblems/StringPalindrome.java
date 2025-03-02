package basicproblems;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println(isPalindrome(str, 0, str.length() - 1));
    }

    static boolean isPalindrome(String str, int left, int right){
        if(left >= right)
            return true;
        if(str.charAt(left) != str.charAt(right))
            return false;
        return isPalindrome(str, left + 1, right - 1);
    }
}
