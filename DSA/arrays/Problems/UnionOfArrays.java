package arrays.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3, 4, 5, 6};
        System.out.println(findUnion(a, b));
    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        List<Integer> list = new ArrayList<Integer>();
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i = 0; i < a.length; i++){
            set.add(a[i]);
        }
        for(int i = 0; i < b.length; i++){
            set.add(b[i]);
        }
        return list.addAll(set);
    }
}
