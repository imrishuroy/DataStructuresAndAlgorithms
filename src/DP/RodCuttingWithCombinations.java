package DP;/*
🧩 ROD CUTTING PROBLEM — COUNTING MAXIMUM VALUE COMBINATIONS (ORDERED)

🔸 PROBLEM STATEMENT:
You are given a rod of length `n` inches and an array `cost[]`, where `cost[i]` represents the price of a rod piece of length `i + 1`.

Find the **number of different combinations (ordered)** in which you can cut the rod such that the **total selling value is maximum**.

➕ The order of rod pieces matters.
➕ You can reuse any rod length multiple times (unbounded).
➕ You need to count the **number of ways** to reach that maximum value.

---

📥 SAMPLE INPUT:
    cost = {0, 2, 4, 6, 8, 9}; // 1-based indexing
    n = 5;

🔢 OUTPUT:
    Maximum Value = 10
    Number of Combinations = 15

🧠 INTUITION:
This is a variation of the **Unbounded Knapsack Problem**, but we are also asked to count the number of **ordered permutations** that result in the **maximum value**.

We maintain two DP arrays:
1. `rod[i]` → Stores the maximum value obtainable for rod length `i`
2. `possibilities[i]` → Stores the number of ordered combinations that give `rod[i]`

---

🔧 APPROACH:
1. Initialize `rod[0] = 0` and `possibilities[0] = 1` (1 way to make 0)
2. For each rod length `i` from 1 to `n`:
   - Try all possible first cuts `j` from 1 to `i`
   - Calculate: `value = cost[j] + rod[i - j]`
   - If this value is better than current max, update:
     - `rod[i] = value`
     - Reset `possibilities[i] = possibilities[i - j]`
   - Else if it equals the current max, add ways:
     - `possibilities[i] += possibilities[i - j]`
3. Finally, return `possibilities[n]` as the answer.

---

📦 TEST CASES:

1. cost = {0, 2, 4, 6, 8, 9}, n = 5 → Output: 15
2. cost = {2, 5, 7, 8}, n = 4 → Output: 2
   - Maximum value = 10 (cut as [2,2])
   - Ways = 2 ([2,2], [2,2])
3. cost = {1, 5, 8, 9}, n = 4 → Output: 4
4. cost = {3, 5, 8, 9, 10, 17, 17, 20}, n = 8 → Output: Depends on value calculation

---

⏱️ TIME COMPLEXITY:
- Outer loop runs for `n` times.
- Inner loop runs up to `i` times in each iteration.
- Total Time: **O(n^2)**

🧠 SPACE COMPLEXITY:
- Two arrays of size `n + 1` → **O(n)**

---
*/

public class RodCuttingWithCombinations {

    public static int countRodCuttingWays(int[] cost, int n) {
        int[] dp = new int[n + 1];               // Stores max value at each length
        int[] possibilities = new int[n + 1];     // Stores number of ways to achieve max value
        possibilities[0] = 1;                     // One way to cut rod of length 0

        for (int i = 1; i <= n; i++) {
            int maxVal = Integer.MIN_VALUE;

            for (int j = 1; j <= i; j++) {
                int value = cost[j] + dp[i - j];

                if (value > maxVal) {
                    maxVal = value;
                    possibilities[i] = possibilities[i - j]; // reset
                } else if (value == maxVal) {
                    possibilities[i] += possibilities[i - j]; // accumulate
                }
            }

            dp[i] = maxVal;
        }

        System.out.println("Maximum Value: " + dp[n]);
        return possibilities[n];
    }

    public static void main(String[] args) {
        int[] cost = {0, 2, 4, 6, 8, 9}; // 1-based indexing for cost[i] = price of rod length i
        int n = 5;

        int ways = countRodCuttingWays(cost, n);
        System.out.println("Number of combinations to achieve max value: " + ways);
    }
}
