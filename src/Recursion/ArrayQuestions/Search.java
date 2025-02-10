package Recursion.ArrayQuestions;

public class Search {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 9, 0};
        int target = 0;
        int index = search(arr, target, 0);
        System.out.println("index " + index);
    }

    // TC -> O(N), SC -> O(N) stack space
    public static int search(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return search(arr, target, index + 1);
    }
}
