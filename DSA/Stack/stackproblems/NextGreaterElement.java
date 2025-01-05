package stackproblems;

import java.util.Arrays;
import java.util.Stack;
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 6, 3, 6, 9, 0};
        System.out.println(Arrays.toString(nextGreaterElement(arr)));
    }

    static int[] nextGreaterElement(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = n - 1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= nums[i]){
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return result;
    }
}
