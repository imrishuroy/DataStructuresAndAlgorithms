package Recursion;

public class Concept {

    public static void main(String[] args) {
        fun(5);

    }

    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        // fun(n--);
        // n-- and --n are not same, although they do n = n - 1,
        // n--, is post order, means it will send always the current value and never reduce it
        // --n, reduce the number and then send it ot the recursive call
        fun(--n);
    }
}
