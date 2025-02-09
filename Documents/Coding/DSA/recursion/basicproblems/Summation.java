// Sum of First N Natural Numbers
// 	•	Compute the sum of the first N natural numbers recursively.

package basicproblems;

public class Summation {
    public static void main(String[] args) {
        summation(10, 0);
    }

    static void summation(int n, int result){
        if(n < 1){
            System.out.println(result);
            return;
        }
        summation(n - 1, result + n);
    }
}
