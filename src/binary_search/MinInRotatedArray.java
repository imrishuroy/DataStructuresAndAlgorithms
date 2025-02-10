package binary_search;

import java.util.ArrayList;
import java.util.Arrays;

/* Q
    Given an integer array nums of size N, sorted in ascending order with distinct values,
    and then rotated an unknown number of times (between 1 and N), find the minimum element in the array.
*/

public class MinInRotatedArray {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3));

        int min = findMin(arr);
        System.out.println(min);
    }

    public static int findMin(ArrayList<Integer> arr) {

        int min = Integer.MAX_VALUE;
        int low = 0, high = arr.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr.get(low) <= arr.get(mid)) {
                // left part is sorted
                min = Math.min(arr.get(low), min);
                low = mid + 1;
            } else {
                // right part is sorted
                min = Math.min(arr.get(mid), min);
                high = mid - 1;
            }
        }

        return min;
    }


    }
