package binary_search;

public class SearchX {

    private static int binarySearch(int[] nums, int left, int right, int target){
        if(left > right){
            return -1;
        }
        // int mid = ( left + right ) / 2;
        // other ways to calculate the mid
        int mid = left + ( right - left ) / 2;
        if(target == nums[mid]){
            return mid;
        }else if(target > nums[mid]){
            return binarySearch(nums, mid + 1, right, target);
        }else{
            return binarySearch(nums, left, mid - 1, target);
        }
    }

    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        int n = nums.length;
        int left = 0;
        int right = n - 1;

        int ans = binarySearch(nums, left, right, target);
        System.out.println(ans);




        /*
         loop
         int n = nums.length;
         int left = 0;
         int right = n - 1;

          while(left <= right){
             int mid = (left + right) / 2;
             if(nums[mid] == target){
                 return mid;
             }else if(target > nums[mid]){
                 left = mid + 1;
             }else{
                 right = mid - 1;
             }
          }

         return - 1;

         */

         /*
         Approach - 1
         int n = nums.length;
         int middle = n/2;
         if(target >= nums[middle]){
             for(int i = middle; i < n; i++){
                 if(nums[i] == target){
                     return i;
                 }
             }
         }else{
             for(int i = 0; i < middle; i++){
                 if(nums[i] == target){
                         return i;
                         }
                     }
         }
         return -1;
         */
    }
}
