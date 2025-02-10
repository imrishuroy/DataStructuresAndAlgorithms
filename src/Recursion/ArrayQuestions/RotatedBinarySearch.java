package Recursion.ArrayQuestions;

public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        int target = 8;
//        int index = rotatedBinarySearch(arr, target);
//        System.out.println("index " + index);

        //

        int index2 = rotatedBinarySearchRecur(arr, target, 0, arr.length - 1);
        System.out.println("index " + index2);
    }
    
    // the only caveat here is array will be sorted either on the left or on the right
    public static int rotatedBinarySearch(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[left] < arr[mid]){
                if(arr[left] <= target && target <= arr[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(arr[mid] <= target && target <= arr[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int rotatedBinarySearchRecur(int[] arr, int target, int left, int right){
        if(left > right){
            return -1;
        }
        int mid = left + (right - left) / 2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[left] <= arr[mid]){ // left part is sorted
            // check if the target belongs to this range
            if(arr[left] <= target && target <= arr[mid]){
                return rotatedBinarySearchRecur(arr, target, left, mid - 1);
            }else{
                return rotatedBinarySearchRecur(arr, target, mid + 1, right);
            }
        }else{
            if(arr[mid] <= target && target <= arr[right]){
                return rotatedBinarySearchRecur(arr, target, mid + 1, right);
            }else{
                return rotatedBinarySearchRecur(arr, target, left, mid - 1);
            }
        }
    }
}
