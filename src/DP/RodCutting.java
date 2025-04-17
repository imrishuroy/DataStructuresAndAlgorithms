package DP;/*
 🧩 ROD CUTTING PROBLEM

 🔸 PROBLEM STATEMENT:
 You are given a rod of length 'n' inches and an array of prices. This array contains prices of smaller pieces of that rod when sold.
 Find the maximum value that could be earned by cutting up the rod and selling the pieces


 You are given a rod of length `n` and an array `cost[]` where `cost[i]` represents the price of a rod piece of length `i + 1`.
 You can cut the rod in any way (including not at all), and you want to find the maximum revenue you can earn by selling the pieces.

 💡 INTUITION:
 This is a variation of the Unbounded Knapsack Problem.
 At every rod length, you have the option to:
   - Cut a piece of length `j` (for all j from 1 to i)
   - Add its price to the best price you can get for the remaining rod (`i - j`)
 So we explore all possible ways to cut the rod and store the best outcomes for sub-lengths in a DP table.

 🔧 APPROACH:
 - Create a DP array `dp[]` of size `n + 1` where `dp[i]` represents the maximum revenue for rod length `i`.
 - Initialize `dp[0] = 0` because no rod means no revenue.
 - For each length `i` from 1 to `n`, try cutting the rod at all possible positions `j` (1 to i), and update `dp[i]` with:
      dp[i] = max(dp[i], cost[j - 1] + dp[i - j])
 - Return `dp[n]` as the final answer.

 ⏱️ TIME COMPLEXITY:
 - Outer loop runs for `n` times.
 - Inner loop runs up to `i` times in each iteration => O(n^2)

 🧠 SPACE COMPLEXITY:
 - Only one 1D array of size `n + 1` is used => O(n)

 📦 SAMPLE INPUT:
    cost = {2, 5, 7, 8}, n = 4

 🔢 OUTPUT:
    10
    (Explanation: Cut the rod into lengths [2,2] giving 5 + 5 = 10)

 ✅ INITIAL TEST CASES:
    1. cost = {2, 5, 7, 8}, n = 4 → Expected: 10
    2. cost = {1, 5, 8, 9}, n = 4 → Expected: 10 (cut into 2+2 or take 4)
    3. cost = {3, 5, 8, 9, 10, 17, 17, 20}, n = 8 → Expected: 24
    4. cost = {1, 1, 1, 1}, n = 4 → Expected: 4
    5. cost = {5, 6, 7, 8}, n = 4 → Expected: 8 (take 4 directly)

 📚 RELATED QUESTIONS (PRACTICE):
    - Unbounded Knapsack (Leetcode)
    - Coin Change II (Leetcode 518)
    - Integer Break (Leetcode 343)
    - Minimum Number of Coins (GFG)
    - Cutting a Rod (GFG)

*/

public class RodCutting {

    public static int rodCutter(int[] cost, int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int maxVal = Integer.MIN_VALUE;
            for (int j = 1; j <= i; j++) {
                maxVal = Math.max(maxVal, cost[j - 1] + dp[i - j]);
            }
            dp[i] = maxVal;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int[] cost = {2, 5, 7, 8};
        int n = 4;
        System.out.println("Max Revenue: " + rodCutter(cost, n)); // Output: 10
    }
}
