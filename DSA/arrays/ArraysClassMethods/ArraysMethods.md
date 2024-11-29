# Arrays Class Methods that will be used most of the times in DSA

1. Sorting

Arrays.sort(array)

Sorts the array in ascending order.

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  // Output: [1, 2, 3, 5, 8]
    }
}

Arrays.sort(array, fromIndex, toIndex)

Sorts a specified range of the array.

public class SortRangeExample {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr, 1, 4);  // Sorts from index 1 to 3 (inclusive)
        System.out.println(Arrays.toString(arr));  // Output: [5, 1, 2, 8, 3]
    }
}

Arrays.parallelSort(array)

Uses parallel processing to sort large arrays more efficiently.

public class ParallelSortExample {
    public static void main(String[] args) {
        int[] arr = {9, 3, 7, 5, 8, 1};
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));  // Output: [1, 3, 5, 7, 8, 9]
    }
}

2. Searching

Arrays.binarySearch(array, key)

Performs a binary search for the key in a sorted array.

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(arr, 3);  // Searches for 3
        System.out.println(index);  // Output: 2 (index of 3)
    }
}

3. Comparison

Arrays.equals(array1, array2)

Compares two arrays for equality (both elements and order).

public class EqualsExample {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {3, 2, 1};

        System.out.println(Arrays.equals(arr1, arr2));  // Output: true
        System.out.println(Arrays.equals(arr1, arr3));  // Output: false
    }
}

Arrays.deepEquals(array1, array2)

Compares arrays that may contain nested arrays (e.g., 2D arrays).

public class DeepEqualsExample {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {3, 4}};
        int[][] arr2 = {{1, 2}, {3, 4}};
        int[][] arr3 = {{4, 3}, {2, 1}};
        
        System.out.println(Arrays.deepEquals(arr1, arr2));  // Output: true
        System.out.println(Arrays.deepEquals(arr1, arr3));  // Output: false
    }
}

4. Filling

Arrays.fill(array, value)

Fills the entire array with a specified value.

public class FillExample {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Arrays.fill(arr, 10);
        System.out.println(Arrays.toString(arr));  // Output: [10, 10, 10, 10, 10]
    }
}

Arrays.fill(array, fromIndex, toIndex, value)

Fills a specific range of the array.

public class FillRangeExample {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Arrays.fill(arr, 1, 4, 7);  // Fills indices 1 to 3 with 7
        System.out.println(Arrays.toString(arr));  // Output: [0, 7, 7, 7, 0]
    }
}

5. Copying

Arrays.copyOf(original, newLength)

Creates a copy of the array with a new length.

public class CopyExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] copyArr = Arrays.copyOf(arr, 5);  // Copies to a new array with length 5
        System.out.println(Arrays.toString(copyArr));  // Output: [1, 2, 3, 0, 0]
    }
}

Arrays.copyOfRange(original, fromIndex, toIndex)

Copies a specific range of the array.

public class CopyRangeExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] rangeCopy = Arrays.copyOfRange(arr, 1, 4);  // Copy elements from index 1 to 3
        System.out.println(Arrays.toString(rangeCopy));  // Output: [2, 3, 4]
    }
}

6. Conversion

Arrays.toString(array)

Converts a 1D array to a string representation.

public class ToStringExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));  // Output: [1, 2, 3, 4]
    }
}

Arrays.deepToString(array)

Converts a 2D (or nested) array to a string representation.

public class DeepToStringExample {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(arr));  // Output: [[1, 2], [3, 4]]
    }
}

7. Parallelism (Advanced)

Arrays.parallelPrefix(array, operator)

Performs parallel prefix computation using a specified operator.

public class ParallelPrefixExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        Arrays.parallelPrefix(arr, (a, b) -> a + b);  // Cumulative sum
        System.out.println(Arrays.toString(arr));  // Output: [1, 3, 6, 10]
    }
}

Arrays.parallelSetAll(array, generator)

Sets all elements of the array in parallel using a generator function.

public class ParallelSetAllExample {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Arrays.parallelSetAll(arr, i -> i * 2);  // Sets each element as its index * 2
        System.out.println(Arrays.toString(arr));  // Output: [0, 2, 4, 6, 8]
    }
}

8. Stream Operations

Arrays.stream(array)

Converts an array into a stream for functional operations like filtering, mapping, etc.

import java.util.Arrays;

public class StreamExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(arr).sum();  // Sum of elements in the array
        System.out.println(sum);  // Output: 15
    }
}

9. Hash Code

Arrays.hashCode(array)

Computes the hash code of an array.

public class HashCodeExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.hashCode(arr));  // Output: A unique hash code for the array
    }
}

Arrays.deepHashCode(array)

Computes the hash code for nested arrays (e.g., 2D arrays).

public class DeepHashCodeExample {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepHashCode(arr));  // Output: A unique hash code for the nested array
    }
}
