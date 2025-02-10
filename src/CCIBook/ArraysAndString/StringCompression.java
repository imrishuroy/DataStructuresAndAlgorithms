package CCIBook.ArraysAndString;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {

    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String ans = compression(input);
        System.out.println(ans);

    }

    public static String compression(String str){

        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;
        for(int i = 0; i < str.length(); i++){
            countConsecutive++;
            if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)){
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }

        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}
