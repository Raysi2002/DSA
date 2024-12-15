package matrix.problemss;
import java.util.*;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(spiralTraversal(mat));
    }

    static List<Integer> spiralTraversal(int[][] matrix){
        List<Integer> list = new ArrayList<>();

        //Define pointers
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = n - 1;
        int top = 0, bottom = m - 1;

        while(left <= right && top <= bottom){

            //left to right
            for(int i = left; i <= right; i++){
                list.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;
            for(int i = right; i >= left; i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;

            for(int i = bottom; i >= top; i--){
                list.add(matrix[i][left]);
            }
            left++;
        }

        return list;
    }
}
