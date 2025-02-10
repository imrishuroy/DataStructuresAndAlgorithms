package Recursion;

public class Print {

    public static void main(String[] args) {
//        print(5);
//        System.out.println(" ");
//        printRev(5);
        printBoth(5);
    }


    public static void print(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        print(n - 1);
    }

    public static void printRev(int n){
        if(n == 0){
            return;
        }
        printRev(n - 1);
        // it will print the numbers when returning back
        System.out.println(n);
    }

    // TC -> O(N), SC -> O(N)
    public static void printBoth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printBoth(n - 1);
        System.out.println(n);
    }

}
