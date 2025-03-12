package sliding_window;

public class MaximumAverageSubArray {

    public static void main(String[] args) {

    }

    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        double avgMaxSum = (double) sum / k;
        int right = k;

        while(right < n){
            sum = (sum - nums[left]) + nums[right];
            double avg = sum / k;
            avgMaxSum = Math.max(avgMaxSum, avg);
            left++;
            right++;
        }

        return avgMaxSum;

    }
}
