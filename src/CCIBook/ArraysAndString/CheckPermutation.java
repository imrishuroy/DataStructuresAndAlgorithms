package CCIBook.ArraysAndString;

import java.util.*;

public class CheckPermutation {

    public static void main(String[] args) {
        String s = "god";
        String t = "dog";

        boolean ans = isPermutation(s, t);
        System.out.println(ans);
    }


   static String sort(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }


   static boolean permutation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }

    static boolean isPermutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[128];
        for (char c : s.toCharArray()) {
            letters[c]++; // count number of each char in s
        }

        for (char c : t.toCharArray()) {
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }

        return true;
    }
}
