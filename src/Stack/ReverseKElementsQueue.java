package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKElementsQueue {

    // TC -> O(N)
    // SC -> O(N)
    public static void reverseKElements(Queue<Integer> queue, int k) {
        if (queue.isEmpty() || k <= 0 || k > queue.size()) {
            return; // Invalid case
        }

        Stack<Integer> stack = new Stack<>();

        // Step 1: Push first K elements into the stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        // Step 2: Enqueue back in reversed order
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Step 3: Move the remaining elements to the back
        int remaining = queue.size() - k;
        for (int i = 0; i < remaining; i++) {
            queue.add(queue.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        int k = 3;
        reverseKElements(queue, k);

        // Print modified queue
        System.out.println(queue); // Output: [3, 2, 1, 4, 5]
    }
}