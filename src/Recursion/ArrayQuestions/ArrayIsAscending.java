package Recursion.ArrayQuestions;

public class ArrayIsAscending {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};

        boolean ans = isSorted(arr, 0);
        System.out.println(ans);
    }

    public static boolean isSorted(int[] arr, int index){
        // we are the last index, we have completed iterating all the items in the array
        if(index == arr.length - 1){
            return true;
        }

        if(arr[index] > arr[index + 1]){
            // if current item at current index is greater than next index
            return false;
        }

        return isSorted(arr, index + 1);
    }
}
