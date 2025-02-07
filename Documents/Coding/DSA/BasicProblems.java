public class BasicProblems {
    public static void main(String[] args) {
        // printName("Aashish", 5);
        count1ToN(100);
    }

    static void printName(String name, int count){
        if(count == 0)
            return;
        System.out.println(name);
        printName(name, count - 1);
    }

    static void count1ToN(int n){
        if (n == 0)
            return;
        System.out.print(n + " ");
        count1ToN(n - 1);
    }
    static void countNTo1(int n){
        if (n == 100)
            return;
        System.out.print(n + " ");
        count1ToN(n - 1);
    }
}
