package BinaryTree;

import Practice.Sorting.Array;

import java.util.ArrayList;
import java.util.*;


class Pair<K, V> {
    private K key;
    private V value;

    // Constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter for key
    public K getKey() {
        return key;
    }

    // Setter for key
    public void setKey(K key) {
        this.key = key;
    }

    // Getter for value
    public V getValue() {
        return value;
    }

    // Setter for value
    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}

public class PrePostInorderTraversal {

    public static void main(String[] args) {

    }

    // Function to get the Inorder, Preorder, and Postorder traversals
    // of Binary Tree in One traversal
    public static List<List<Integer>> treeTraversal(TreeNode root) {
        // Lists to store traversals
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        // If the tree is empty, return empty traversals
        if (root == null) {
            return Arrays.asList(inOrder, pre, post);
        }

        // Stack to maintain nodes and their traversal state
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();

        // Start with the root node and state 1 (inorder)
        stack.push(new Pair<>(root, 1));

        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> it = stack.pop();

            // Process the node based on its state
            if (it.getValue() == 1) {
                // Inorder: Add node data
                inOrder.add(it.getKey().data);
                // Change state to 2 (preorder) for this node
                it.setValue(2);
                // Push the updated state back onto the stack
                stack.push(it);

                // Push left child onto the stack for processing
                if (it.getKey().left != null) {
                    stack.push(new Pair<>(it.getKey().left, 1));
                }
            }

            // If state is 2, process for Preorder traversal
            else if (it.getValue() == 2) {
                // Preorder: Add node data
                pre.add(it.getKey().data);
                // Change state to 3 (postorder) for this node
                it.setValue(3);
                // Push the updated state back onto the stack
                stack.push(it);

                // Push right child onto the stack for processing
                if (it.getKey().right != null) {
                    stack.push(new Pair<>(it.getKey().right, 1));
                }
            }

            // If state is 3, process for Postorder traversal
            else {
                // Postorder: Add node data
                post.add(it.getKey().data);
            }
        }

        // Returning the traversals as a list of lists
        return Arrays.asList(pre, inOrder, post);
    }

}
