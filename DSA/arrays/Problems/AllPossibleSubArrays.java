package arrays.problems;

public class AllPossibleSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2};
        int totalSubArrays = 0;
        int len = arr.length;
        for(int i = 0; i < len; i++){
            for(int j = i; j < len; j++){
                for(int k = 0; k < j; k++){
                    System.out.print(arr[k] + " ");
                    totalSubArrays++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(totalSubArrays);
    }

    public static int maxSubArrays(int[] arr){
        int totalSubArrays = 0;
        int len = arr.length;
        if (len == 0)
            return 0;
        for(int i = 0; i < len; i++){
            for(int j = i; j < len; j++){
                for(int k = 0; k < j; k++){
                    System.out.print(arr[k] + " ");
                    totalSubArrays++;
                }
                System.out.println();
            }
            System.out.println();
        }
        return totalSubArrays;  
    }
}
