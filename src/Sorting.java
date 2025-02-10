import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 40};
//        System.out.println(Arrays.toString(sort(nums, 0)));


        for(int i = 0; i < nums.length-2; i++){
            int minIndex = i;
            for(int j = i+1; j < nums.length; j++){
                if(nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            swap(nums, i, minIndex);
        }

        System.out.println(Arrays.toString(nums));
    }

    private static int[] sort(int[] nums, int i){
        if(i >= nums.length){
            return nums;
        }
        int minIndex = i;
        for(int j = i+1; j < nums.length; j++){
            if(nums[minIndex] > nums[j]){
                minIndex = j;
            }
        }
        swap(nums, i, minIndex);
        return sort(nums, i+1);
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
