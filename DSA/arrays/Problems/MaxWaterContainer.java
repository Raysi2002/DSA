package arrays.problems;

import java.util.*;

public class MaxWaterContainer{
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        // int[] arr = {1, 1};
        // System.out.println(maxWaterCapacity(arr));
        System.out.println(maxArea(arr));
    }
    //Brute Force approach
    public static int maxWaterCapacity(int[] arr){
        int maxCapacity = 0;

        for (int i = 0; i < arr.length; i++) {
            int minWall = 0;
            int currentCapacity = 0;
            for (int j = i+1; j < arr.length; j++) {
                minWall = Math.min(arr[i], arr[j]);
                currentCapacity = minWall * (j-i);
                maxCapacity = Math.max(maxCapacity, currentCapacity);
            }
        }
        return maxCapacity;
    }
    //Two pointer optimal approach
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        for(int i = 0; i < height.length; i++){
            int currentArea = Math.min(height[leftPointer], height[rightPointer]) * (rightPointer - leftPointer);
            maxArea = Math.max(maxArea, currentArea);
            if(height[leftPointer] < height[rightPointer])
                leftPointer--;
            else
                rightPointer--;
        }

        return maxArea;
    }
}