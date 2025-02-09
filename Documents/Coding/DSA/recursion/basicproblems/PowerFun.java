package basicproblems;

public class PowerFun {
    public static void main(String[] args) {
        System.out.println(pow(10, 2));
    }

    static int pow(int a, int pow){
        if(pow <= 0)
            return 1;
        return a * pow(a, pow - 1);
    }
}
