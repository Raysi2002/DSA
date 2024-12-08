package bitmanipulation;

public class CheckBit {

    public static void main(String[] args) {
        System.out.println(checkKthBit(898888888, 15));
        System.out.println(Integer.toBinaryString(898888888));
    }
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        // Your code here
        String str = Integer.toBinaryString(n);
        StringBuffer bf = new StringBuffer(str);
        bf.reverse();
        if(k >= bf.length()){
            return false;
        }
        if(bf.charAt(k) == '1'){
            return true;
        }
        return false;
    }

}