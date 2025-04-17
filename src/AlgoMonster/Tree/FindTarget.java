package AlgoMonster.Tree;

class TreeNode<T>{
    T val;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode (T val){
        this.val = val;
        left = null;
        right = null;
    }

    public TreeNode(T val, TreeNode<T> left, TreeNode<T> right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class FindTarget {

    public static void main(String[] args) {
        // Creating a sample tree:
        //        1
        //       / \
        //      2   3
        //     / \   \
        //    4   5   6
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left = new TreeNode<>(2);
        root.right = new TreeNode<>(3);
        root.left.left = new TreeNode<>(4);
        root.left.right = new TreeNode<>(5);
        root.right.right = new TreeNode<>(6);

        // Test cases
        testSearch(root, 3, true);  // Should find node 3
        testSearch(root, 5, true);  // Should find node 5
        testSearch(root, 6, true);  // Should find node 6
        testSearch(root, 7, false); // Should not find node 7 (not in tree)
        testSearch(null, 1, false); // Should return null for empty tree
    }

    private static void testSearch(TreeNode<Integer> root, int target, boolean expectedFound) {
        TreeNode<Integer> result = FindTarget.searchNode(root, target);
        boolean found = (result != null);

        if (found == expectedFound) {
            System.out.println("Test passed for target: " + target);
        } else {
            System.out.println("Test failed for target: " + target);
        }
    }

    public static TreeNode<Integer> searchNode(TreeNode<Integer> root, int target){
        if(root == null){
            return null;
        }

        if(root.val == target){
            return root;
        }

        TreeNode<Integer> left = searchNode(root.left, target);
        if(left != null){
            return left;
        }

        return searchNode(root.right, target);

    }
}
