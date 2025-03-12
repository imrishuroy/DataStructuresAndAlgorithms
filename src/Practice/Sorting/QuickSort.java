package Practice.Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(Strings[] args) {
        int[] arr = {4, 2, 1, 6, 8};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void quickSort(int[] arr){
        quickSortHelper(arr, 0, arr.length - 1);
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[low];

        int i = low;

        int j = high;

        while(i < j){
            // move i to the right until we find an element greater that the pivot
            while (arr[i] <= pivot && i <= high - 1){
                i++;
            }

            while (arr[j] > pivot && j >= low + 1){
                j--;
            }

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // pivot placed in correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j]= temp;
        return j;
    }

    private static void quickSortHelper(int[] arr, int low, int high){
        if(low < high){
            int pIndex = partition(arr, low, high);
            quickSortHelper(arr, low, pIndex - 1);
            quickSortHelper(arr, pIndex + 1,high);
        }
    }
}
