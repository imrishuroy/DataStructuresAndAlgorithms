package Recursion;

public class CountZeros {

    public static void main(String[] args) {
        int num = 30204;
        int count = countZeros(num);
        System.out.println(count);
    }

    public static int countZeros(int num){
        return countZerosHelper(num, 0);
    }

    public static int countZerosHelper(int num, int count){
        if(num == 0){
            return count;
        }
        int rem = num % 10;
        if(rem == 0) count++;
        return countZerosHelper(num / 10, count);
    }
}
