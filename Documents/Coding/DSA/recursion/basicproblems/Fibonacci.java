package basicproblems;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibbonacci(10));
    }

    static int fibbonacci(int n){
        if(n == 1 || n == 0)
            return n;
        return fibbonacci(n - 1) + fibbonacci(n - 2);
    }
}
