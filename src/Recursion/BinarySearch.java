package Recursion;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {1, 2, 4, 6, 8, 10};
        int target = 100;
        int ans = binarySearch(array, target, 0, array.length - 1);
        System.out.println(ans);
    }

    // Recurrence relation -> f(n) = O(1) + f(n/2)
    private static int binarySearch(int[] array, int target, int left, int right){
        if(left > right){
            return -1;
        }
        int mid = left + ( right - left ) / 2;
        if(array[mid] == target){
            return mid;
        }else if(target > array[mid]){
           return binarySearch(array, target, mid + 1, right);
        }else {
           return binarySearch(array, target, left, mid - 1);
        }
    }
}
