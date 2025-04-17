package AmazonOA;

/*
    Your team at Amazon has recently adopted a new password validation scheme for internal user accounts.

    A password consists of lowercase English letters only and is valid only if contains at least one vowel and at least
    one vowel and at least one consonant. Vowels are the characters 'a', 'e', 'i', 'o', 'u'. The rest are constants.
    The strength of a password is defined as the maximum number of contiguous subsegments the entire password can be
    divided into such that each subsegment is a valid password

    Given a password string find its strength.
    Return 0 if the password itself is not valid.

    Note: A subsegment of string is a segment composed of contiguous characters of the original string, taken in same order.

    Example
    password = "hackerrank"

    This password can be divided into 3 subsegments "hack", "er", "rank". Each segment contains at least one vowel and one consonant.
    It can be shown that the string cannot be divided into more than 3 valid subsegments.
    The strength of the password is 3.

    Constraints

     1 <= |password| <= 10^5 ( the length of password )
     password consists of lowercase English letter only.

 */

public class PasswordStrength {

    public static void main(String[] args) {
        String password = "hackerrank";
        int strength = findPasswordStrength(password);
        System.out.println(strength);
    }

    public static int findPasswordStrength(String password){
        if(!isValidPassword(password)){
            return 0;
        }

        int n = password.length();
        int count = 0;
        int start = 0;

        for(int index = 0; index < n; index++){
            if(isValidPassword(password.substring(start, index + 1))){
                count++;
                start = index + 1;
            }
        }

        return count;
    }

    private static boolean isValidPassword(String str){
        boolean containsVowels = false;
        boolean containsConsonants = false;

        for(char ch : str.toCharArray()){
            if(isVowel(ch)){
                containsVowels = true;
            }else if (Character.isLetter(ch)){
                containsConsonants = true;
            }
        }

        return containsVowels && containsConsonants;
    }

    private static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
