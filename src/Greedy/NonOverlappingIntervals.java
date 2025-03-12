package Greedy;

import java.util.Arrays;

public class NonOverlappingIntervals {

    public static void main(String[] args) {

        int[][] intervals = { {1, 2} , {2, 3} , {3, 4} ,{1, 3} };

        MaximumNonOverlappingIntervals(intervals);
    }


    public static int MaximumNonOverlappingIntervals(int[][] Intervals) {

        int n = Intervals.length;

        Arrays.sort(Intervals, (a, b) -> a[1] - b[1]);


        return 0;
    }


}
