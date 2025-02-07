// When a function calls itself directly or indirectly is called recursion

public class Basics{
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        recursiveFun(10000);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    static void recursiveFun(long n){
        if(n == 0)
            return;
        recursiveFun(n - 1);
    }
}