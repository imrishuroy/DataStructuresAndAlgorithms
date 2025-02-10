package Recursion.String;

public class SkipApple {

    public static void main(String[] args) {
        String str = "bcdapplefy";
        String ans = skipApple(str, new StringBuilder());
        System.out.println(ans);

        String ansSkipApp = skipAppNotApple(str, new StringBuilder());
        System.out.println(ansSkipApp);

    }

    public static String skipApple(String str, StringBuilder ans){
        if(str.isEmpty()){
            return ans.toString();
        }

        if(str.startsWith("apple")){
            return skipApple(str.substring(5), ans);
        }else{
            ans.append(str.charAt(0));
            return skipApple(str.substring(1), ans);
        }
    }

    public static String skipAppNotApple(String str, StringBuilder ans){
        if(str.isEmpty()){
            return ans.toString();
        }

        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipAppNotApple(str.substring(3), ans);
        }else{
            ans.append(str.charAt(0));
            return skipAppNotApple(str.substring(1), ans);
        }

    }
}
