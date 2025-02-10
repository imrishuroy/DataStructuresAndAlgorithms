package Recursion;

public class IsArraySorted {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        boolean ans = isArraySorted(array, 0);
        System.out.println(ans); // Should print true

    }

    public static boolean isArraySorted(int[] array, int index) {
        // Base case: If we reach the last element, array is sorted
        if (index == array.length - 1) {
            return true;
        }
        // If current element is greater than next, array is not sorted
        if (array[index] > array[index + 1]) {
            return false;
        }
        // Recur for the next index
        return isArraySorted(array, index + 1);
    }
}
