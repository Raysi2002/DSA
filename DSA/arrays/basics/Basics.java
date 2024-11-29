package arrays.basics;
import java.util.*;

public class Basics{
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 2, 3, 4, 2};
        Set<Integer> set = new HashSet<Integer>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(set.toArray()));
        // int[] uniqueArray = new int[set.size()];
        // for (int i = 0; i < uniqueArray.length; i++) {
        //     uniqueArray[i] = set(i)
        // }
    }
}