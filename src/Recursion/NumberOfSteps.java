package Recursion;

public class NumberOfSteps {

    /*
        Given an integer num, return the number of steps to reduce it to zero.
        In one step, if the current number is even, you have to divide it by 2,
        otherwise, you have to subtract 1 from it.
     */

    public static void main(String[] args) {
        int num = 14;
        int steps1 = numberOfSteps(num);
        System.out.println("steps " + steps1);

    }


    public static int numberOfSteps(int num) {

        // iterative sol^n
        int count = 0;
        while(num > 0){
            count++;
            if(num % 2 == 0){
                num = num / 2;
            }else{
                num = num - 1;
            }
        }

        return count;

        // recursive solution
        // return stepsCounter(num, 0);
    }

    public int stepsCounter(int num, int count){
        if(num == 0){
            return count;
        }
        count++;
        if(num % 2 == 0){
            return stepsCounter(num / 2, count);
        }else{
            return stepsCounter(num - 1, count);
        }
    }


}
