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
        ArrayList<Integer> unionList = new ArrayList<>();
        int i = 0;
        int j = 0;
        int alen = a.length;
        int blen = b.length;
        while (i < alen && j < blen) {
            if(a[i] != b[j]){
                if(a[i] < b[j]){
                    unionList.add(a[i]);
                }
                else{
                    unionList.add(b[i]);
                }
            }
        }
    }
}
