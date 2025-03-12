package Practice.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(Strings[] args) {
        int[] nums = {3, 5, 8, 1, 3, 4};
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void mergeSort(int[] nums) {
        mergeSortHelper(nums, 0, nums.length - 1);
    }


    private static void merge(int[] nums, int low, int mid, int high){
        // temp array
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                temp.add(nums[left]);
                left++;
            }else{
                temp.add(nums[right]);
                right++;
            }
        }

        while (left <= mid){
            temp.add(nums[left]);
            left++;
        }

        while (right <= high){
            temp.add(nums[right]);
            right++;
        }

        for(int i = low; i <= high; i++){
            // The purpose of i - low is to correctly access elements in temp,
            // since temp starts from index 0, while nums starts from low.
            nums[i] = temp.get(i - low);
        }
    }

    public static void mergeSortHelper(int[] nums, int low, int high){
        if(low >= high){
            return;
        }

        int mid = (low + high) / 2;

        mergeSortHelper(nums, low, mid);
        mergeSortHelper(nums, mid + 1, high);

        merge(nums, low, mid, high);
    }


}
