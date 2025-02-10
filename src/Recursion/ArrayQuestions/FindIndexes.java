package Recursion.ArrayQuestions;

import java.util.ArrayList;

public class FindIndexes {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 4, 4};
        int target = 4;
        ArrayList<Integer> ans = searchIndexes(arr, target, 0, new ArrayList<>());
        System.out.println(ans);

        //
        ArrayList<Integer> ans2 = searchIndex2(arr, target, 0);
        System.out.println(ans2);
    }

   static public ArrayList<Integer> searchIndexes(int[] arr, int target, int index, ArrayList<Integer> ans){
        if(index == arr.length){
            return ans;
        }

        if(arr[index] == target){
            ans.add(index);
        }

        return searchIndexes(arr, target, index + 1, ans);
    }

    static public ArrayList<Integer> searchIndex2(int[] arr, int target,int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> prevList = searchIndex2(arr, target, index + 1);
        list.addAll(prevList);
        return list;
    }
}
