package Recursion.String;

public class SkipA {

    public static void main(String[] args) {
        String str = "baccad";
        String ans = skipA(str);
        String ans2 = skipARecur(str, 0, new StringBuilder());

        System.out.println(ans2);
    }

    public static String skipA(String str){
        StringBuilder ans = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch == 'a' || ch == 'A'){
                continue;
            }
            ans.append(ch);
        }
        return ans.toString();
    }

    public static String skipARecur(String str, int index, StringBuilder ans){
        if(index == str.length()){
            return ans.toString();
        }

        if(str.charAt(index) != 'a' && str.charAt(index) != 'A'){
            ans.append(str.charAt(index));
        }

        return skipARecur(str, index + 1, ans);
    }


}
