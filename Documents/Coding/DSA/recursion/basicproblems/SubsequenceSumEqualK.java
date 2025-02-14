package basicproblems;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceSumEqualK {
    public static void main(String[] args) {
        int[] arr = {3,5,6,7};
        List<Integer> current = new ArrayList<>();
        // subsequenceSumEqualK(arr, 0, current, 0, 2);
        System.out.println(isSubsequenceSumEqualK(arr, 0, current, 0, 9));
    }

    public static void subsequenceSumEqualK(int[] arr, int index, List<Integer> current, int sum, int k){
        if(index == arr.length){
            if(sum == k){
                System.out.println(current);
            }
            return;
        }

        //including 
        current.add(arr[index]);
        subsequenceSumEqualK(arr,  index + 1, current, sum + arr[index], k);

        //Exclude
        current.remove(current.size() - 1);
        subsequenceSumEqualK(arr, index + 1, current, sum, k);
    }

    public static int countSubsequenceSumEqualK(int[] arr, int index, List<Integer> current, int sum, int k){
        if(index == arr.length){
            return sum == k ? 1 : 0;
        }

        //including 
        current.add(arr[index]);
        int include = countSubsequenceSumEqualK(arr,  index + 1, current, sum + arr[index], k);
        //Exclude
        current.remove(current.size() - 1);
        int exclude = countSubsequenceSumEqualK(arr, index + 1, current, sum, k);

        return include + exclude;
    }

    public static boolean isSubsequenceSumEqualK(int[] arr, int index, List<Integer> current, int sum, int k){
        if(index == arr.length){
            return sum == k;
        }
        if(isSubsequenceSumEqualK(arr, index + 1, current, sum + arr[index], k)){
            return true;
        }
        if(isSubsequenceSumEqualK(arr, index + 1, current, sum, k)){
            return true;
        }
        return false;
    }

}
