package Recursion;

import java.util.Arrays;

// ush the largest element to the end of the array in every iteration
//TC - O(N^2), SC → O(1)
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {15, 2, 35, 7, 1, 10};
//        bubbleSort(arr);
//        bubbleSortRecur(arr, 0, arr.length - 1);
        bubbleSortRecurOptimized(arr, arr.length - 1, false);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        int right = arr.length - 1;
        boolean isSorted;

        while (right > 0){
            isSorted = true;
            for(int i = 0; i < right; i++){
                if(arr[i] > arr[i + 1]){
                    swap(arr, i, i + 1);
                    isSorted = false;
                }
            }
            if(isSorted) break;
            right--;
        }
    }

    public static void bubbleSortRecur(int[] arr, int index, int right){
        if(right < 0){
            return;
        }
        if(index < right){
            if(arr[index] > arr[index + 1]){
                swap(arr, index, index + 1);
            }
            bubbleSortRecur(arr, index + 1, right);
        }else{
            bubbleSortRecur(arr, 0, right - 1);
        }
    }

    /*
    Tail recursion is a type of recursion where the recursive call is the last operation performed in a function, meaning
    there are no pending operations after the recursive call. This allows the compiler or interpreter to optimize the recursion by
    replacing the function call with a simple loop (this is called tail call optimization (TCO)).
     */
    public static void bubbleSortRecurOptimized(int[] arr, int right, boolean isSorted){
        if(right < 0 || isSorted) return;

        isSorted = true;
        for(int i = 0; i < right; i++){
            if(arr[i] > arr[i + 1]){
                swap(arr, i , i + 1);
                isSorted = false;
            }
        }

        bubbleSortRecurOptimized(arr, right - 1, isSorted);
    }

        public static void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
}
