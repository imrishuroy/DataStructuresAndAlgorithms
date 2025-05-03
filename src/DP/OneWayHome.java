package DP;
import java.util.*;

public class OneWayHome {

    public static void main(String[] args){
        int m = 3;
        int n = 3;

        int ways = uniquePaths(m, n);
        System.out.println(ways);
    }


/*
    Problem Statement
    You are located at the top-left corner of a m * n grid.
    You can only move either right or down at any point in time. 
    You home is located at the bottom right corner of this grid
    In how many unique ways can you reach your home ?


*/

    public static int uniquePaths(int m, int n){

        int[][] dp = new int[m][n];

        // setting first row to 1, as there is only onw way to move in this row
        for(int i = 0; i < m; i++){
            dp[i][0] = 1;
        }

          // setting first column to 1, as there is only onw way to move in this column
        for(int j = 0; j < n; j++){
            dp[0][j] = 1;
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                // sum of no of ways to reach one cell before horizontal and vertical
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }


}