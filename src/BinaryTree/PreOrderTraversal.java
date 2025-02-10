package BinaryTree;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

    /*
        Intuition
        Preorder traversal is one of the depth-first traversal methods used to explore nodes in a binary tree. The algorithm first visits the root node, then in the preorder traversal, we visit (i.e., add to the array) the current node by accessing its value, then we recursively traverse the left subtree in the same manner. We repeat these steps for the left subtree, then when we return to the current node, we recursively travel to the right subtree in a preorder manner as well. The sequence of steps in preorder traversal follows: Root, Left, Right.

        Approach
        Base Case: If the current node is null, it means we have reached the end of a subtree and there are no further nodes to explore. Hence the recursive function stops and we return from that particular recursive call.
        Recursive Function:
        Process Current Node: The recursive function begins by processing i.e., adding to the array or printing the current node.
        Traverse Left Subtree: Recursively traverse the left subtree by invoking the preorder function on the left child of the current node. This step continues the exploration of nodes in a depth-first manner.
        Traverse Right Subtree: After traversing the entire left subtree, we traverse the right subtree recursively. We once again invoke the preorder function, but this time on the right child of the current node.
        Dry Run
        Algorithm:

        Step 1: Check for the base case that if the current node is null, exit the void function.
        Step 2: Push the value of the current node into the preorder traversal array.
        Step 3: Invoke the preorder function on the left child then right child to traverse the left and right subtrees in the preorder manner respectively.

     */
    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> result =  preorder(root);

        // Displaying the preorder traversal result
        System.out.print("Preorder Traversal: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();


    }


    public static List<Integer> preorder(TreeNode root) {

//         recursive, TC -> O(N), SC -> O(N)
         List<Integer> ans = new ArrayList<>();
         func(root, ans);
         return ans;


        // Iterative
//        List<Integer> ans = new ArrayList<>();
//        Stack<TreeNode> stack = new Stack<>();
//
//        if(root == null){
//            return ans;
//        }
//
//        stack.add(root);
//
//        while (!stack.isEmpty()){
//
//            root = stack.pop();
//            ans.add(root.data);
//
//            if(root.right != null){
//                stack.add(root.right);
//            }
//
//            if(root.left != null){
//                stack.add(root.left);
//            }
//
//        }
//
//        return ans;

    }

    private static void func(TreeNode node, List<Integer> ans){

        // base case
        if(node == null){
            return;
        }

        ans.add(node.data);

        // left traversal
        func(node.left, ans);

        // right traversal
        func(node.right, ans);


    }





}
