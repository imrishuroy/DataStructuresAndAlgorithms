package Recursion.String;

import java.util.ArrayList;
import java.util.Stack;

public class Permutations {

    public static void main(String[] args) {

//        permutations("abc", "");

        ArrayList<String> ans = permutationsList("abc", "");
        System.out.println(ans);

        int count = permutationsCount("abc", "");
        System.out.println(count);

    }

    static void permutations(String str, String permutation){
        if(str.isEmpty()){
            System.out.println(permutation);
            return;
        }

        char ch = str.charAt(0);
        for(int i = 0; i <= permutation.length(); i++){
            String f = permutation.substring(0, i);
            String s = permutation.substring(i);
            permutations(str.substring(1),f + ch + s);
        }
    }

    static ArrayList<String> permutationsList(String str, String permutation){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(permutation);
            return list;
        }

        char ch = str.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0; i <= permutation.length(); i++){
            String f = permutation.substring(0, i);
            String s = permutation.substring(i);
            ans.addAll(permutationsList(str.substring(1),f + ch + s));
        }

        return ans;
    }

    static int permutationsCount(String str, String permutation){
        if(str.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = str.charAt(0);
        for(int i = 0; i <= permutation.length(); i++){
            String f = permutation.substring(0, i);
            String s = permutation.substring(i);
            count = count + permutationsCount(str.substring(1),f + ch + s);
        }

        return count;
    }




}
