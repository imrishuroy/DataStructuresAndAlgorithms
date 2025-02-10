package Recursion;

public class Palindrome {

    public static void main(String[] args) {
        int num = 121;
        boolean isPalindrome = num == reverse(num);
        System.out.println(isPalindrome);
    }

    public static int reverse(int num){
        return reverseHelper(num, 0);
    }

    public static int reverseHelper(int num, int pNum){
        if(num == 0){
            return pNum;
        }
        int rem = num % 10;
        pNum = pNum * 10 + rem;
        return reverseHelper(num / 10, pNum);
    }
}
