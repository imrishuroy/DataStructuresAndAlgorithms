public class Recursion {


    public static void main(String[] args) {

        System.out.println(factorial(3));
        int[] nums = {1, 2, 3};
        int count = nums.length;



//        int count = 1;
//        int n = 4;
//        printName("Rishu", 4);
//        printNumber(count, n);
//        printNumber2(n);
//        System.out.println("------------");
//        printNTo1(n);
    }




    public static long factorial( int n){
        // base condition
        if(n <= 1) return 1;
        return n * factorial(n-1);
    }








    // parameterized recursion
    public static void printName(String name, int n){
        if(n == 0){
            return;
        }
        System.out.println(name);
        printName(name, n-1);

    }

    // Head Recursion
    public static void printNumber(int count, int n){
        if(count > n){
            return;
        }
        System.out.println(count);
        printNumber(count+1, n);
    }

    // Trail Recursion
    public static void printNumber2(int n){
        if(n == 0 ){
            return;
        }

        printNumber2(n-1);
        System.out.println(n);
    }

    public static void printNTo1(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNTo1(n-1);
    }
}
