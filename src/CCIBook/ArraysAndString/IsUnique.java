package CCIBook.ArraysAndString;

// Q Implement an algorithm to determine if a string has all unique characters.
public class IsUnique {


    public static void main(String[] args) {
        String word = "Rishur";
        boolean ans = isUnique(word);
        System.out.println(ans);

    }

    static boolean isUnique(String str){
        if(str.length() > 128) return false;

        boolean[] charSet = new boolean[128];

        for(int i = 0; i < str.length(); i++){
            if(charSet[str.charAt(i)]){ // already found this char in string
                return false;
            }
            charSet[str.charAt(i)] = true;
        }
        return  true;
    }

    static boolean isUniqueChars(String str){
        int checker = 0;
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i) - 'a';
            if((checker & ( 1 << val )) > 0){
                return false;
            }
            checker |= (1 << val);
        }
        return false;
    }


}
