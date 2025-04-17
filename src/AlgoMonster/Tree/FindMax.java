package AlgoMonster.Tree;

public class FindMax {

    public static int max = Integer.MIN_VALUE;
    public static int findMax2(TreeNode<Integer> root){
        dfs2(root);
        return max;
    }

    public static void dfs2(TreeNode<Integer> node){
        if(node == null){
            return;
        }

        if(node.val > max){
            max = node.val;
        }

        dfs2(node.left);
        dfs2(node.right);
    }

    public static int findMax(TreeNode<Integer> root) {
        return dfs(root);
    }



    private static int dfs(TreeNode<Integer> node) {
        if (node == null) {
            return Integer.MIN_VALUE; // Return the smallest integer to ensure correct max calculation
        }

        int leftMax = dfs(node.left);
        int rightMax = dfs(node.right);

        return Math.max(node.val, Math.max(leftMax, rightMax)); // Compare node value with left and right subtrees
    }

    public static void main(String[] args) {
        // Constructing a sample tree:
        //        3
        //       / \
        //      1   5
        //         / \
        //        4   6
        TreeNode<Integer> root = new TreeNode<>(3);
        root.left = new TreeNode<>(1);
        root.right = new TreeNode<>(5);
        root.right.left = new TreeNode<>(4);
        root.right.right = new TreeNode<>(6);

        System.out.println("Max value in tree: " + findMax2(root)); // Expected Output: 6
    }
}
