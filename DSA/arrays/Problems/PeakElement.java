// 12. Find the Peak Element

// 	•	Problem: An element is a peak if it is not smaller than its neighbors. Given an array, find a peak element in it. (Note: Peak element may not be unique.)
// Example:
// Input: {1, 3, 20, 4, 1}
// Output: 20
package arrays.problems;
import java.util.ArrayList;
import java.util.List;

public class PeakElement{
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 20, 4, 5,1};
        System.out.println(peakElement(arr));
    }

    //Brute Force (First came in mind)
    public static List<Integer> peakElement(int[] arr){
        List<Integer> peakElement = new ArrayList<Integer>();

        if(arr[0] > arr[1])
            peakElement.add(arr[0]);

        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1])
                peakElement.add(arr[i]);
        }
        if(arr[arr.length - 1] > arr[arr.length - 2])
            peakElement.add(arr[arr.length - 1]);
        return peakElement;
    }
}