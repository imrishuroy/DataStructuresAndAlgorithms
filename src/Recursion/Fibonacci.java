package Recursion;

// TC -> (2^n), SC -> O(n)
public class Fibonacci {
    public static void main(String[] args) {
      int ans =  fibonacci(7);
      System.out.println(ans);
    }

    // 0, 1, 1, 2, 3, 5, 8, f(n) -> f(n - 1) + f(n - 2)
    private static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
