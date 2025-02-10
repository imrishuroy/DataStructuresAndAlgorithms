package Recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        int n = 1234;
        int ans = sumOfDigits(n);
        int recAns = sumOfDigitsRecursive(n);
        System.out.println(recAns);

        int prod = prod(55);
        System.out.println(prod);
    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    // recurrence relation -> sum(num) = num % 10 + sum(num / 10)
    public static int sumOfDigitsRecursive(int num){
        if(num == 0){
            return 0;
        }
        return num % 10 + (sumOfDigitsRecursive(num /10));
    }

    static int prod(int num){
//        if(num == 0){
//            return 1;
//        }

        if(num % 10 == num){
            return num;
        }

        return (num % 10) * prod(num / 10);
    }


}
