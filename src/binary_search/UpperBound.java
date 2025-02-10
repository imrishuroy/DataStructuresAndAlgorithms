package binary_search;

public class UpperBound {

    public static void main(String[] args) {

        int[] nums = {3,5,8,15,19};
        int x = 9;

        int left = 0, right = nums.length - 1;
        int ans = nums.length;

        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] > x){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
