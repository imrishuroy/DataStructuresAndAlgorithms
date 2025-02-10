package Recursion.Pattern;

public class Triangle {

    public static void main(String[] args) {


//        printTriangleRecur(4, 0);
        printTriangleRecur2(4, 0);



//        printTriangle(4);
//        printTriangleRecur2(4, 0);



    }

    public static void printTriangle(int n){
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void printTriangleRecur(int n, int count){
        // base case
        if(n == 0){
            return;
        }

        if(count < n){
            // print the stars
            System.out.print(" * ");
            printTriangleRecur(n, count + 1);
        }else{
            System.out.println();
            printTriangleRecur(n - 1, 0);
        }
    }

    // it will print when the function call is coming back
    public static void printTriangleRecur2(int n , int count){
        if(n == 0){
            return;
        }
        if(count < n){
            // print the starts when the function call will return back to its caller
            printTriangleRecur2(n, count + 1);
            System.out.print(" * ");
        }else{
            printTriangleRecur2(n - 1, 0);
            System.out.println();
        }
    }



//    public static void printTriangleRecur(int n){
//        if(n < 0){
//            return;
//        }
//        for(int i = 0; i < n; i++){
//            System.out.print(" * ");
//        }
//        System.out.println();
//        printTriangleRecur(n - 1);
//    }
//
//    public static void printTriangleRecur2(int n, int count){
//        if(count > n){
//            return;
//        }
//        for(int i = 0; i < count; i++){
//            System.out.print(" * ");
//        }
//        System.out.println();
//        printTriangleRecur2(n, count + 1);
//    }
}
