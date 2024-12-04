package arrays.problems;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 9, 10, 23, 45};
        System.out.println(binarySearch(arr, 0, arr.length, 23));
        System.out.println(binarySearchUsingLoop(arr, 23));
    }

    public static int binarySearch(int[] arr, int left, int right, int key){
        int mid = (left + right) / 2;
        for (int i = 0; i < arr.length; i++) {
            if(arr[mid] == key)
                return mid;
            else if(arr[mid] > key)
                return binarySearch(arr, left, mid, key);
            else if(arr[mid] < key)
                return binarySearch(arr, mid, right, key);
            else
                return -1;
        }
        return -1;
    }

    public static int binarySearchUsingLoop(int[] arr, int key){
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right)/2;
        for(left = 0; right = )
        return -1;
    }   
}
