package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationPhoneNumber {

    private static final Map<Character, String>  phoneMap = new HashMap<>();
    static {
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> ans = letterCombination(digits);
        System.out.println(ans);
    }

    public static List<String> letterCombination(String digits){
        ArrayList<String> result = new ArrayList<>();
        if(digits == null || digits.isEmpty()){
            return result;
        }
        exploreCombinations(digits, 0, new StringBuilder(), result);
        return result;
    }

    private static void exploreCombinations(String digit, int index, StringBuilder combination, List<String> result){
        // base case: if the combination length is equal to the digits length, add to result
        if(index == digit.length()){
            result.add(combination.toString());
            return;
        }

        // get the letters corresponding to the current digit
        String letters = phoneMap.get(digit.charAt(index));
        for(char ch : letters.toCharArray()){
            // add the current character to the combination
            combination.append(ch);

            // move on to the next digit
            exploreCombinations(digit, index + 1, combination, result);

            // backtrack to explore other combination
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}
