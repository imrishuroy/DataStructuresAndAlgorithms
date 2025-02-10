package BinaryTree;

public class Diameter {
    static int diameter = 0;
    public static void main(String[] args) {
        // Example usage: Create a tree and find its diameter
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Diameter d = new Diameter();
        int result = d.diameterOfBT(root);
        System.out.println("Diameter of the binary tree is: " + result);
    }


    public static int diameterOfBT(TreeNode root){
        calculateHeight(root);
        return diameter;
    }

    private static int calculateHeight(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1 ;
    }
}
