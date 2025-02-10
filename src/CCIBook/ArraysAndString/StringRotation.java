package CCIBook.ArraysAndString;

public class StringRotation {

    public static void main(String[] args) {

        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        boolean ans = rotateString(s1, s2);
        System.out.println(ans);
    }

    public static boolean rotateString(String s, String goal) {
        return(s.length() == goal.length() && (s + s).contains(goal));
    }
}
