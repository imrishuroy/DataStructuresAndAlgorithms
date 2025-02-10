package BinaryTree;

public class SymmetricalBT {
    public static void main(String[] args) {

        SymmetricalBT symmetricalBT = new SymmetricalBT();

        // Create a sample tree: 1, 2, 2, 3, 4, 4, 3
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        // Test the symmetric tree
        System.out.println(symmetricalBT.isSymmetric(root)); // Output: true

    }

    private boolean isSymmetricHelper(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }

        if(left == null || right == null){
            return false;
        }

        if(left.data != right.data){
            return false;
        }

        return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);


    }

    public boolean isSymmetric(TreeNode root){
        // we have reached to the end
        if(root == null){
            return true;
        }
        return isSymmetricHelper(root.left, root.right);
    }
}
