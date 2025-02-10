package Recursion;

public class Factorial {

    public static void main(String[] args) {

        int ans = factorial(4);
        System.out.println(ans);
    }

    // recurrence relation -> factorial(num) = num * factorial(num - 1)
    private static int factorial(int num){
        // base case / terminating case
        if(num <= 1){
            return 1;
        }
        // recursive case
        return num * factorial(num - 1);
    }


}
