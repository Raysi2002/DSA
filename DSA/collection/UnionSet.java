package collection;

import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class UnionSet {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 1, 2, 3, 4, 5, 6, 6};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        
        System.out.println(list.get(0));
        System.out.println(Arrays.toString(union(arr1, arr2)));
    }

    public static int[] union(int[] arr1, int[] arr2){
        Set<Integer> unionSet = new TreeSet<>();
        for(int i = 0; i < arr1.length; i++){
            unionSet.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            unionSet.add(arr2[i]);
        }
        int[] union = new int[unionSet.size()];
        int i = 0;
        for(Integer num : unionSet){
            union[i] = num;
            i++;
        }
        return union;
    }

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new TreeSet<Integer>();
        for(int i = 0; i < a.length; i++){
            set.add(a[i]);
        }
        for(int i = 0; i < b.length; i++){
            set.add(b[i]);
        }
        for(Integer num : set){
            list.add(num);
        }
        return list;
    }

}
