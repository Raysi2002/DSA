package TwoPointers;

import java.util.Arrays;

class GreedyParentAndChildren {
    //Main Function
    public static void main(String[] args) {
        int[] greed = {2, 4, 3, 5, 1};
        int[] cookieSize = {2, 3, 1, 2, 1};
        System.out.println(greedyParentAndChildren(greed, cookieSize));
    }

    //Greedy parent and children function
    public static int greedyParentAndChildren(int[] greed, int[] cookieSize){
        int satisfied = 0;
        Arrays.sort(greed);
        Arrays.sort(cookieSize);
        //Greed array length
        int m = greed.length;
        //Cookie size array length
        int n = cookieSize.length;
        int a = 0;
        int b = 0;

        for(int i=0; i<m; i++){
            int x = greed[a];
            int y = cookieSize[b];
            if (x<=y) {
                satisfied++;
                a++;
                b++;
            }
            else{
                b++;
            }
        }
        return satisfied;
    }

}