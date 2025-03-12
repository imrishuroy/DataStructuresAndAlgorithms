package Practice.Sorting;

import java.util.*;

public class Array {

    public static void main(Strings[] args) {
        int[] nums = {-3, 4, 5, 1, -4, -5};
        ArrayList<Integer> ans = leaders(nums);
        System.out.println(ans);
    }





    public static int[] twoSumTwoPointer(int[] nums, int target){
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left < right){
            if(nums[left] + nums[right] == target){
                return new int[]{left, right};
            }
            left++;
            right++;
        }

        return new int[]{-1, -1};
    }


    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{i, map.get(diff)};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }

    public static ArrayList<Integer> leaders(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();

        if(nums.length == 0){
            return ans;
        }

        int max = nums[nums.length - 1];
        ans.add(max);

        for(int i = n - 2; i >= 0; i--){
            if(nums[i] > max){
                ans.add(nums[i]);
                max = nums[i];
            }
        }

        Collections.reverse(ans);






//        for(int i = 0; i < n; i++){
//            boolean isGreater = true;
//            for(int j = i + 1; j < n; j++){
//                if(nums[j] >= nums[i]){
//                    isGreater = false;
//                    break;
//                }
//            }
//
//            if(isGreater) {
//                ans.add(nums[i]);
//            }
//        }

        return ans;


    }







    public void rotateByKPlaces(int[] nums, int k){
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];

        // Store first k elements in a temporary array
        for(int i = 0; i < k; i++){
            temp[i] = nums[i];
        }

        for(int i = k; i < n; i++){
            nums[i - k] = nums[i];
        }

        for(int i = 0; i < k; i++){
            nums[n - k + 1] = temp[i];
        }
    }

    public void rotateByOne(int[] nums){
        int n = nums.length;
        int temp = nums[0];

        for(int i = 1; i < n; i++){
            nums[i - 1] = nums[i];
        }

        nums[n - 1] = temp;
    }

    public int max1(int[] nums){
        int max = Integer.MIN_VALUE;
        int count = 0;

        for(int num : nums){
            if(num == 1){
                count++;
            }else{
                max = Math.max(max, count);
                count = 0;
            }
        }

        return max;
    }

    public int secondLargest(int[] nums){
        int n = nums.length;
        if(n < 2){
            return -1;
        }
        int largest = nums[n - 1];
        int secondLargest = -1;

        for(int i = n - 2; i >= 0; i--){
            if(nums[i] != largest){
                secondLargest = nums[i];
                break;
            }
        }

        return secondLargest;
    }
}
