package binary_search;

public class SearchInRotatedArray {
    /*
        Given an integer array nums, sorted in ascending order (with distinct values) and a target value k.
        The array is rotated at some pivot point that is unknown.
        Find the index at which k is present and if k is not present return -1.
     */
    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int k = 0;

        int ans = binarySearch(nums, k);
        System.out.println(ans);

    }

    private static int binarySearch(int[] nums, int k){
        int low = 0, high = nums.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == k) return mid;

            if(nums[low] <= nums[mid]){
                // assuming left part is sorted
                if(nums[low] <= k && nums[mid] >= k){
                    high = mid - 1;
                }else {
                    low = mid + 1;
                }
            }else{
                // assuming right part is sorted
                if(nums[mid] <= k && nums[high] >= k){
                    low = mid + 1;
                }else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
