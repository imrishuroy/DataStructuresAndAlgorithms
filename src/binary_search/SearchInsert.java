package binary_search;

//Given a sorted array of nums consisting of distinct integers and a target value,
//return the index if the target is found. If not, return the index where it would be if it were inserted in order.

//Example 1
//Input: nums = [1, 3, 5, 6], target = 5
//Output: 2

//Explanation: The target value 5 is found at index 2 in the sorted array. Hence, the function returns 2.

public class SearchInsert {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        int low = 0;
        int high = nums.length - 1;
        int ans = high + 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        System.out.println(ans);
    }
}
