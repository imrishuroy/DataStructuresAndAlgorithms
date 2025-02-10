package Google;

public class LengthOfLastWord {


    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String str) {

        String[] strArray = str.split(" ");
        if(strArray.length != 0){
            return strArray[strArray.length - 1].length();
        }
        return 0;
    }
}
