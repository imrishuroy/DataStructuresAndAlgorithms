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


/*
    Problem Statement
    You want to reach heaven that is at the top of this staircase.
    The staircase has n steps. And at each step you can climb either 1 step or 2 steps further.
    In how many ways can you reach heaven ?

*/
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
/*  
    As there where many ways to reach heaven, many people walked up this staircase to the heaven.
    But some people were mean and did't want more people to reach heaven so they spilled oil on 
    some stairs so that no one could step on that stair.

    For example, suppose there are only 5 steps on that staircase and stair no.3 has oil spilled on it.
    Then how many ways can you reach heaven now ?
*/

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

    // Following the previoud problem. Now, suppose there are only 5 steps on that staricase and stair no.2 and 3 have oil spilled on it. 
    // Then in how many ways can you reach heaven now ?
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


    

}
