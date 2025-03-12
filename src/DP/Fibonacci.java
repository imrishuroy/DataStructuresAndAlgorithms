package DP;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class Fibonacci {
    /*
       Find the nth Fibonacci number, where n is based on a 0-based index.
       Each ith number is the sum of (i-1)th and (i-2)th numbers, with the first two numbers
       given as 0 and 1.
     */
    public static void main(String[] args) {
        int n = 6;
//        System.out.println(fiboRecursion(n));
        int[] dp = new int[n + 1];
        Arrays.fill(dp, - 1);

        int fibo = fiboDPMemo(n, dp);
        System.out.println(fibo);

        int fiboTabulation = fiboTabulation(n);
        System.out.println("tabulation " + fiboTabulation);

        int fiboSpace = fiboSpace(n);
        System.out.println(fiboSpace);

    }


    // Sol 1. Recursion
    // TC -> O(2^n)
    // SC -> O(n)
    public static int fiboRecursion(int n){
        if(n <= 1){
            return n;
        }
        return fiboRecursion(n - 1) + fiboRecursion(n - 2);
    }
    /*
       Sol 2. Memoization
       Memoization also known as "top-down" dynamic programming, involves solving the problem by recursively breaking it down
       from the main problem to the base cases and storing the results of these sub-problems in a table
       (usually a dictionary or an array). When the same sub-problem is encountered again,
       the stored result is used instead of recomputing it, thereby saving computation time.
    */

    // TC -> O(n)
    // SC -. O(n)
    public static int fiboDPMemo(int n, int[] dp){
        // Base case: return n if n is 0 or 1
        if(n <= 1){
            return n;
        }

        // If the value is already calculated, return it
        if(dp[n] != -1) return dp[n];

        // Calculate the value and store it in dp array
        dp[n] = fiboDPMemo(n - 1, dp) + fiboDPMemo(n - 2, dp);
        return dp[n];
    }

    /*
        Sol 3: Tabulation, also known as "bottom-up" dynamic programming, involves solving the problem by
        iteratively solving all possible sub-problems, starting from the base cases and building up to the
        solution of the main problem. The results of sub-problems are stored in a table, and each entry in the table is
        filled based on previously computed entries.

        Steps to Convert Recursive Solution to Tabulation

        Declare a dp[] array of size n+1.
        Initialize base condition values, i.e., i=0 and i=1 of the dp array as 0 and 1 respectively.
        Use an iterative loop to traverse the array (from index 2 to n) and set each value as dp[i-1] + dp[i-2].

     */

      // TC -> O(n)
      // SC -> O(n)
      private static int fiboTabulation(int n){

          if(n <= 1){
              return n;
          }

          int[] dp = new int[n + 1];
          dp[0] = 0;
          dp[1] = 1;

          for(int i = 2; i <= n; i++){
              dp[i] = dp[i - 1] + dp[i - 2];
          }
          return dp[n];
      }

      // TC - O(n)
      // SP - O(1)
      private static int fiboSpace(int n){

//          // Edge case: if n is 0, the result is 0
//          if(n == 0){
//              return 0;
//          }
//          // Edge case: if n is 1, the result is 1
//          if(n == 1){
//              return 1;
//          }

          if(n <= 1){
              return n;
          }

          int prev2 = 0;
          int prev = 1;

          for(int i = 2; i <= n; i++){
              int curr = prev + prev2;
              prev2 = prev;
              prev = curr;
          }
          return prev;
      }
}
