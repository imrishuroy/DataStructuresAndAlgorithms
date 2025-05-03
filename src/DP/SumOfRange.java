package dp;
import java.util.*;

public class SumOfRange {

/*
    You are being given an integer array named arr, you need to find the sum of elements between
    indices i and j (i <= j), inclusive.
    Note that there are many such queries that you need to ans

*/
    public static void main(String[] args){
        int[] arr = {1, -2, 3, 10, -8, 0};
        int ans = sumRange(arr, 2, 4);
        System.out.println(ans);

    }

    public static int sumRange(int[] array, int i, int j) {
        int n = array.length;
        int[] sumUnitl = new int[n];

        for(int index = 0; index < n; index++){
            if(index == 0){
                sumUnitl[index] = array[index];
            }else {
                sumUnitl[index] = sumUnitl[index - 1] + array[index];
            }
        }
        System.out.println(Arrays.toString(sumUnitl));

        if(i == 0){
            return sumUnitl[j];
        }
        
        return sumUnitl[j] - sumUnitl[i - 1];
    }


}