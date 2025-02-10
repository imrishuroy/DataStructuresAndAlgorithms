package binary_search;

public class SmallestDivisor {

    public static void main(String[] args) {
        // Input: nums = [1, 2, 3, 4, 5], limit = 8
        int[] nums = {1, 2, 3, 4, 5};
        int limit = 8;

        int ans = smallestDivisor(nums, limit);
        System.out.println(ans);
    }


    private static int smallestDivisor(int[] nums, int limit){
        for(int i = 1; i <= limit; i++){
            int temp = 0;
            for (int num : nums) {

                int thresholdValue = (num + i - 1) / i;
                temp += thresholdValue;
            }
            if(temp <= limit){
                return i;
            }
        }
        return -1;
    }

}
