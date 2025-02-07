// 1.	Print Numbers (Decreasing & Increasing Order)
// 	•	Print numbers from N to 1.
// 	•	Print numbers from 1 to N.

package basicproblems;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int n = sc.nextInt();
        Nto1(n);
    }

    static void Nto1(int n){
        if(n < 1)
            return;
        System.out.println(n);
        Nto1(n - 1);
    }
}
