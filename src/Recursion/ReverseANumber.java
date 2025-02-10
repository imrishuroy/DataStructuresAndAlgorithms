package Recursion;

public class ReverseANumber {

    public static void main(String[] args) {
        int num = 1234; // 4321
        int ans1 = reverse(num);
        System.out.println(ans1);
        //
//        reverseRecursive(num);
//        System.out.println(ans);

        // by global variable
        reverseRecursive(num);
        System.out.println(ans);

        // by helper fun
         int ans3 = reverseRecursive2(num);
         System.out.println(ans3);
    }

    static int ans = 0;

    public static int reverse(int num){
        int ans = 0;

        while (num > 0){
            // ans = ans * 10 + rem
            ans = ans * 10 + num % 10;
            num = num / 10;
        }

        // 4 * 10 * 0
        // 4 * 10 * 1 + 3 = 43
        // 43 * 10 * 1 + 2 = 432
        // 432 * 10 * 1 + 1 = 4321
        return ans;
    }



    public static void reverseRecursive(int num){
        if(num == 0){
            return;
        }
        ans = ans * 10 + num % 10;
        reverseRecursive(num / 10);
    }

    public static int reverseRecursive2(int num){
        int ans = 0;
        return reverseHelper(num, ans);
    }

    public static int reverseHelper(int num, int ans){
        if(num == 0){
            return ans;
        }
        ans = ans * 10 + num % 10;
       return reverseHelper(num / 10, ans);
    }

}
