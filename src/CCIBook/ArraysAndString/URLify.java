package CCIBook.ArraysAndString;

public class URLify {

    public static void main(String[] args) {
        String word =  "Mr John Smith   ";
        String ans = replaceSpaces(word.trim());
        System.out.println(ans);

    }

   public static String replaceSpaces(String str){
        StringBuilder ans = new StringBuilder();
        char[] chars = str.toCharArray();
        for(char c : chars){
            if(c == ' '){
                ans.append("%20");
            }else{
                ans.append(c);
            }

        }
        return ans.toString();
    }
}
