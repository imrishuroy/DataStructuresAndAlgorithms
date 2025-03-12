package Practice.Sorting;

import java.util.Arrays;
import java.util.Vector;

public class Strings {

    public static void main(String[] args) {
        Vector<Character> str =
                new Vector<>(Arrays.asList('h', 'e', 'l', 'l', 'o'));

        reverse(str);
        System.out.println(str);
    }

    public static String reverse(Vector<Character> s){
        int n = s.size();
        int left = 0;
        int right = n - 1;

        while(left < right){
            char temp = s.elementAt(left);
            s.set(left, s.get(right));
            s.set(right, temp);
            left++;
            right--;
        }

        return s.toString();
    }
}
