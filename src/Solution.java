
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Vector;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        String s = "anagram", t = "nagaram";
        if(s.length() != t.length()){
            System.out.println("false");
        }
        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);

        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);



        System.out.println(Arrays.toString(sChars).equals(Arrays.toString(tChars)));









//        String  s = "abcde" , goal = "cdeab";
//        if(s.length() != goal.length()){
////            return false;
//        }
//        int n = s.length();
//
//
//        String ans = s;
//
//        for(int i = 0; i < n - 1; i++){
//            ans = ans.substring(1) + ans.charAt(0);
//            if(ans.equals(goal)){
//                System.out.println("found");
//            }
//
//            System.out.println(ans);
//        }
//
//        System.out.println(ans);



//        String s = "egg" , t = "add";
//
//        HashMap<Character, Character> map = new HashMap<>();
//        for(int i = 0; i < Math.min(s.length(), t.length()); i++){
//         //   s.charAt(i): t.charAt(i)
//            map.put(s.charAt(i), t.charAt(i));
//        }
//
//        System.out.println(map);
//
//        // now loop through the hashmap
//        StringBuilder str = new StringBuilder();
//        for(int i = 0; i < s.length(); i++){
//            str.append(map.get(s.charAt(i)));
//        }
//
//        System.out.println(str.toString().equals(t));









//        String s = "002031438";
//
//        int n = s.length();
//        int i = 0;
//        int j = 0;
//
//        for(int k = n-1; k >= 0; k--){
//            int temp = Character.getNumericValue(s.charAt(k));
//            if(temp % 2 != 0){
//                j = k;
//                break;
//            }
//        }
//
//
//        for(int l = 0; l < n; l++){
//            int value = Character.getNumericValue(s.charAt(l));
//            System.out.println(value);
//            if(value != 0){
//                i = l;
//                break;
//            }
//        }
//
//        System.out.println(s.substring(i, j+1));






























//        String s = "hannah";
//        char[] chars = s.toCharArray();
//        int n = chars.length;
//
//        for(int i = 0; i < n/2; i++){
//            char temp = chars[i];
//            int trailingIndex = n - i - 1;
//            chars[i] = chars[trailingIndex];
//            chars[trailingIndex] = temp;
//        }
//
////        System.out.println(chars.toString().equals(s));
//        System.out.println(new String(chars).equals(s));











//        int[] arr = {1, 2, 3, 4, 5};
//        int n = arr.length;
//
//
//        for(int i = 0; i < n/2; i++){
//            int temp = arr[i];
//            arr[i] = arr[n - i - 1];
//            arr[n - i - 1] = temp;
//        }
//
//
//       for(int item: arr) {
//           System.out.println(item);
//       }




//    Vector<Character> chars = new Vector<>(5);
//        chars.add('h');
//        chars.add('e');
//        chars.add('l');
//        chars.add('l');
//        chars.add('o');
//
//        int len = chars.size();
//        for(int i = 0; i < len/2; i++){
//            char temp = chars.get(i);
//            int trailingIndex = len - i - 1;
//            chars.set(i, chars.get(trailingIndex));
//            chars.set(trailingIndex, temp);
//        }
//
//        for(char ch : chars){
//            System.out.print(ch);
//        }
//
//        Vector<Integer> vector = new Vector<>(5);
//
//        vector.add(1);
//        vector.add(2);
//        vector.add(3);
//        vector.add(4);
//        vector.add(5);
//
//        for (int i = 0; i < vector.size(); i++) {
//            System.out.print(vector.get(i));
//        }
//
//        System.out.println();
//
//        int n = vector.size();
//        for(int i = 0; i < n/2; i++){
//            int temp = vector.get(i);
//            vector.set(i, vector.get(n - i - 1));
//            vector.set(n - i - 1, temp);
//        }
//
//        for (int i = 0; i < vector.size(); i++) {
//            System.out.print(vector.get(i));
//        }



    }
}
