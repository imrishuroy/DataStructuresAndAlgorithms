package CCIBook.ArraysAndString;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {

    public static void main(String[] args) {
        String phrase = "TactCoa";
        boolean ans = isPermutationOfPalindrome(phrase.toLowerCase());
        System.out.println(ans);
    }

    static boolean isPermutationOfPalindrome(String phrase){

        int[] charCounts = new int[128];
        for(int i = 0; i < phrase.length(); i++){
            charCounts[phrase.charAt(i)]++;
        }

        int count = 0;
        for(int i = 0; i < 128; i++){
            count += charCounts[i] % 2;
        }

        return count <= 1;

//        Map<Character, Integer> freqMap = new HashMap<>();
//        char[] chars = phrase.toCharArray();
//        for(char c : chars){
//            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
//        }
//
//        System.out.println(freqMap);
//
//        boolean isOneOdd = false;
//        for(char c : chars){
//            if(freqMap.get(c) % 2 == 1){ // we got the odd number
//                if(isOneOdd){
//                    return false;
//                }
//                isOneOdd = true;
//            }
//        }
//        return true;
    }


}
