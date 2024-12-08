package hasharray;

public class Param {
    public static void main(String[] args) {
        String str = "A quick brown fox Jumps over the lazy dog";
        System.out.println(isParam(str));
        // System.out.println(str.toUpperCase());
        // System.out.println('Z' - 'A');

    }

    public static boolean isParam(String str){
        str = str.toUpperCase();
        //Define a hash array of array size
        boolean[] status = new boolean[26];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch)){
                int index = ch - 'A';
                status[index] = true;
            }
        }
        for(int i = 0; i < status.length; i++){
            if(!status[i])
                return false;
        }

        return true;
    }
}
