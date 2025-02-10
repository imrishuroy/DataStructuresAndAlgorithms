package Recursion.String.SubSet;

import java.util.ArrayList;
import java.util.List;

public class SubSetArray {

    public static void main(String[] args) {

    }

    static List<List<Integer>> subsSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
}

