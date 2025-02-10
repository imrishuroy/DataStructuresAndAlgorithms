package binary_search;

public class LowerBound {

    public static void main(String[] args) {

        int[] nums = {3,5,8,15,19};
        int x = 9;

        int low = 0, high = nums.length - 1;
        int ans = nums.length;

        while (low <= high){
            int mid = (low + high) / 2;

            if(nums[mid] >= x){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
