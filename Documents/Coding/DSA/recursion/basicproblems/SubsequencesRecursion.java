package basicproblems;

import java.util.ArrayList;
import java.util.List;

public class SubsequencesRecursion {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        List<Integer> current = new ArrayList<>();
        // printSubSequences(arr, 0, current);
        withDuplicates(arr, 0, current);
    }

    static void printSubSequences(int[] arr, int index, List<Integer> current){
        if(index == arr.length ){
            System.out.println(current);
            return;
        }

        current.add(arr[index]);
        printSubSequences(arr, index + 1, current);

        current.remove(current.size() - 1);
        printSubSequences(arr, index + 1, current);
    }

    static void withDuplicates(int[] arr, int index, List<Integer> current){
        if(index == arr.length){
            System.out.println(current);
            return;
        }

        current.add(arr[index]);
        withDuplicates(arr, index + 1, current);
        current.remove(current.size() - 1);
        withDuplicates(arr, index + 1, current);
    }
}
