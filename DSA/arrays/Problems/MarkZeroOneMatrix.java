package arrays.problems;

import java.util.Arrays;

public class MarkZeroOneMatrix {
            //     0 1 2 0
            // 3 4 5 2
            // 1 3 1 5
    public static void main(String[] args) {
        // int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 0}};
        // int[][] arr2 = {{1, 1, 1}, {1, 0, 0}, {1, 1, 1}};
        int[][] mat = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        System.out.println(mat.length);
        setMatrixZeroes(mat);
        for(int[] row : mat){
            System.out.println(Arrays.toString(row));
        }tin
    }

    public static void setMatrixZeroes(int[][] mat) {
        //Brute force approach
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 0){
                    markRow(mat, i);
                    markColumn(mat, j);
                }           
            }
        }
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == -1){
                    mat[i][j] = 0;
                }           
            }
        }
    }
    
    public static void markRow(int[][] mat, int i){
        for(int j = 0; j < mat[0].length; j++){
            if(mat[i][j] != 0){
                mat[i][j] = -1;
            }
        }
    }
    
    public static void markColumn(int[][] mat, int j){
        for(int i = 0; i < mat.length; i++){
            if(mat[i][j] != 0){
                mat[i][j] = -1;
            }
        }
    }
}
