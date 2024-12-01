package arrays.arraysClassMethods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[]{"Aashish", "Ray", "Preeti", "Kanxu", "Love"};
        int[] intArr = {2, 4, 1, 5, 7, 2, 9};
        double[] doubleArr = {4.6, 9.9, 0, 2, 3, 6.4};
        double[] doubleArr2 = {9.9, 2.3, 6.4, 4.6};
        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(doubleArr));

        //Arrays.sort() method
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));

        //Arrays.binarySearch() method
        System.out.println(Arrays.binarySearch(strArray, "Preeti"));

        //Arrays.asList() method
        System.out.println(Arrays.asList(doubleArr));
        
        //Arrays.compare() method
        System.out.println(Arrays.compare(doubleArr2, doubleArr));

        //Arrays.hasComde() method
        System.out.println(Arrays.hashCode(strArray));
        System.out.println(Arrays.hashCode(doubleArr));
        System.out.println(Arrays.hashCode(intArr));
    }
}
