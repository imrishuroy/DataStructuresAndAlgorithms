package DP;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ClimbingStairCase {
    public static void main(String[] args) {
        int n = 4;
        int ways = climbStairs(n);

        int ways2 = climbStairsWithOil(5, 3);

        int ways3 = climbStairsWithOilSteps(5, new HashSet<>(Arrays.asList(2, 4)));
        System.out.println(ways3);

        System.out.println(ways2);
    }

    public static int climbStairsWithOilSteps(int n, Set<Integer> oilSteps) {
        if(oilSteps.contains(0)) return 0; // Optional, step 0 is starting point
        if (n <= 2) return (oilSteps.contains(n)) ? 0 : n;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = oilSteps.contains(1) ? 0 : 1; // Add check for step 1

        for(int i = 2; i <= n; i++){
            if(oilSteps.contains(i)){
                dp[i] = 0;
            }else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }


    public static int climbStairsWithOil(int n, int oilStep) {
        if(oilStep == 0) return 0;
        if (n <= 2) return (oilStep == n) ? 0 : n;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = (oilStep == 1) ? 0 : 1;

        for(int i = 2; i <= n; i++){
            if(i == oilStep){
                dp[i] = 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }

        return dp[n];
    }


    public static int climbStairs(int n) {
        if(n <= 2) return n;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
