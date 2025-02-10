package Recursion;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 5, 2, 4};
//        selectionSort(array);
        selectionSortRecur(array, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {

        int right = array.length - 1;
        while (right > 0) {
            int largestIndex = 0;
            for (int i = 1; i <= right; i++) {
                if (array[i] > array[largestIndex]) {
                    largestIndex = i;
                }
            }
            if(largestIndex != right) {
                swap(array, largestIndex, right);
            }
            right--;
        }
    }

    // tail recursion
    public static void selectionSortRecur(int[] array, int right){
        if(right < 0) return;

        int largestIndex = 0;
        for(int i = 1; i <= right; i++){
            if(array[i] > array[largestIndex]){
                largestIndex = i;
            }
        }

        if(largestIndex != right){
            swap(array, largestIndex, right);
        }

        selectionSortRecur(array, right - 1);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
