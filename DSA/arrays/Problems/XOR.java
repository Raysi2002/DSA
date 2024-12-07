package arrays.problems;

public class XOR {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 8, 7, 6, 5, 9};
        System.out.println(findNonRepeatingNumber(arr));
    }

    public static int findNonRepeatingNumber(int[] arr){
        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }

        return xor;
    }
}
