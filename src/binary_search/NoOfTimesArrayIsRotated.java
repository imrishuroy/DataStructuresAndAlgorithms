package binary_search;

import java.util.ArrayList;
import java.util.Arrays;

/*
* Given an integer array nums of size n, sorted in ascending order with distinct values.
* The array has been right rotated an unknown number of times, between 1 and n.
* Determine the number of rotations performed on the array.
*/
public class NoOfTimesArrayIsRotated {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3));
        int ans = findKRotation(nums);
        System.out.println(ans);

    }

    public static int findKRotation(ArrayList<Integer> nums) {

        int low = 0, high = nums.size() - 1;
        int min = Integer.MAX_VALUE;
        int index = -1;

        while(low <= high){
            int mid = (low + high) / 2;

            // when the array is sorted and not rotated at all
            if(nums.get(low) <= nums.get(high)){
                // left half is sorted
                if(nums.get(low) < min){
                    index = low;
                }
                break;
            }

            // if the left part is sorted
            if(nums.get(low) <= nums.get(mid)){
                if(nums.get(low) < mid){
                    index = low;
                    min = nums.get(low);
                }
                low = mid + 1;
            }else{
                if(nums.get(mid) < min){
                    index = mid;
                    min = nums.get(mid);
                }
                high = mid - 1;
            }
        }

        return index;
    }


}
