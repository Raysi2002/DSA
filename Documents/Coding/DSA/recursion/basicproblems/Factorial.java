// 2.	Factorial of a Number
// 	•	Given N, return N! using recursion.

package basicproblems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }

    static int factorial(int n){
        if(n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
