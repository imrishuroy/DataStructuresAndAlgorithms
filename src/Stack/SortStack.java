package Stack;

import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);

        sortStack(stack);
        System.out.println(stack);

    }

    // TC -> O(N^2)
    // SC -> O(N)
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            // Move elements from tempStack back to stack if they are greater than temp
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        // Copy sorted elements back to original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
