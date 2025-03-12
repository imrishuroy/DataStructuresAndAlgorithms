package Practice.Sorting;

import java.util.Arrays;

public class Sorting {


    public static void main(Strings[] args) {
        int[] nums = {3, 5, 8, 1, 3, 4};
        insertionSort(nums);

        System.out.println(Arrays.toString(nums));

    }



    public static void insertionSort(int[] nums){
        for(int i = 0; i < nums.length; i++) {
            int j = i;

            while (j > 0 && nums[j - 1] > nums[j]) {
                swap(nums, j - 1, j);
                j--;
            }
        }
    }

    public static void bubbleSort(int[] nums){
        boolean isSwap = false;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    swap(nums, i, j);
                    isSwap = true;
                }
            }
            if(!isSwap){
                break;
            }
        }
    }

    public static void recursiveSelectionSort(int[] nums, int i){
        if(i >= nums.length){
            return;
        }

        int minIndex = i;
        for(int j = i + 1; j < nums.length; j++){
            if(nums[j] < nums[minIndex]){
                minIndex = j;
            }
        }
        swap(nums, i, minIndex);
        recursiveSelectionSort(nums, i + 1);
    }

    public static void selectionSort(int[] nums){
        for(int i  = 0; i < nums.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < nums.length; j++){
                if (nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            swap(nums, i, minIndex);
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
