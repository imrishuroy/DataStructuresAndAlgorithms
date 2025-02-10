package binary_search;

import java.util.ArrayList;

/*
* Given an integer array nums, sorted in ascending order (may contain duplicate values) and a target value k.
* Now the array is rotated at some pivot point unknown to you. Return True if k is present and otherwise, return False.
*/

// Tip - If you get a problem that has duplicates, first find the solution for unique and then see
// when the unique will fail and try to fit in that test case

public class SearchRotatedArray2 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(7); arr.add(8); arr.add(1); arr.add(2); arr.add(3);
        arr.add(3); arr.add(3); arr.add(4); arr.add(5); arr.add(6);

        int target = 3;
        boolean isRotated = searchInARotatedSortedArrayII(arr, 3);
        System.out.println(isRotated);

    }

    public static boolean searchInARotatedSortedArrayII(ArrayList<Integer> nums, int k) {

        int low = 0, high = nums.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums.get(mid) == k) return true;

            // handle duplicates: if nums[low], nums[mid], and nums[high] are equal
            if (nums.get(low).equals(nums.get(mid)) && nums.get(mid).equals(nums.get(high))) {
                low = low + 1;
                high = high - 1;
                continue;
            }

            if (nums.get(low) <= nums.get(mid)) {
                if (nums.get(low) <= k && nums.get(mid) >= k) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums.get(mid) <= k && nums.get(high) >= k) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }
}
