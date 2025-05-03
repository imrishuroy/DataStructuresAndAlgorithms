package DP;

import java.util.*;

public class LongestIncreasingSubsequence {

/*
    You are being given an array named nums, and you need to find the longest forming 
     increasing sub-sequence from it
    Longest increasing sub-sequence is the longest sub-sequence such that all elements of the 
    sub-sequence are sorted in increasing order

*/

    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int len = lengthOfLIS(nums);
        System.out.println(len);

        int len2 = lengthOfLIS2(nums);
        System.out.println(len2);



    }

   public static int lengthOfLIS(int[] nums) {
    int n = nums.length;
    
    // Edge case: If array is empty, no increasing subsequence exists
    if (n == 0) return 0;

    // dp[i] will store the length of the Longest Increasing Subsequence ending at index i
    int[] dp = new int[n];

    // Initialize all values to 1, as the minimum LIS at each index is 1 (element itself)
    Arrays.fill(dp, 1);

    // This variable will store the length of the longest subsequence found so far
    int maxLen = 1;

    // Loop over each element to find the LIS ending at that element
    for (int i = 1; i < n; i++) {
        // Check all previous elements before i
        for (int j = 0; j < i; j++) {
            // If nums[i] > nums[j], nums[i] can be added to the subsequence ending at j
            if (nums[i] > nums[j]) {
                // Update dp[i] with the best (longest) option found so far
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        // Update global maxLen if we found a longer subsequence ending at i
        maxLen = Math.max(maxLen, dp[i]);
    }

    // Final answer is the maximum length of increasing subsequence
    return maxLen;
}

    // follow-up
    // We can incorporate a simple change in the algorithm we discussed to print what that longest increasing subsequence is.
    public static int lengthOfLIS2(int[] nums){
        int n = nums.length;
        if(n == 0) return 0;

        int[] dp = new int[n];
        int[] prev = new int[n]; // to track predecessors
        Arrays.fill(dp, 1);
        Arrays.fill(prev, - 1);

        int maxLen = 1;
        int lastIndex = 0;

        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                // dp[i] = Math.max(dp[i], dp[j] + 1);
                if(nums[i] > nums[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j; // track the index we came from
                    
                }
            }

            if(dp[i] > maxLen) {
                maxLen = dp[i];
                lastIndex = i;
            }
        }

        // reconstruct LIS
        List<Integer> list = new ArrayList<>();
        int k = lastIndex;

        while(k != -1){
            list.add(nums[k]);
            k = prev[k];
        }
        Collections.reverse(list);
        System.out.println("LIS " + list);

        return maxLen;
    }
}