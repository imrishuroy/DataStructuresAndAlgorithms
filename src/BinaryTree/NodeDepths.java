package BinaryTree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NodeDepths {
    public static void main(String[] args) {
        // Define the tree structure
        List<BranchSum.NodeData> nodes = List.of(
                new BranchSum.NodeData("1", "2", "3", 1),
                new BranchSum.NodeData("2", "4", "5", 2),
                new BranchSum.NodeData("3", "6", "7", 3),
                new BranchSum.NodeData("4", "8", "9", 4),
                new BranchSum.NodeData("5", "10", null, 5),
                new BranchSum.NodeData("6", null, null, 6),
                new BranchSum.NodeData("7", null, null, 7),
                new BranchSum.NodeData("8", null, null, 8),
                new BranchSum.NodeData("9", null, null, 9),
                new BranchSum.NodeData("10", null, null, 10)
        );

        TreeNode root = buildTree(nodes, "1");

        // Get branch sums
        int depth = nodeDepths(root);
        System.out.println(depth); // Expected Output: [15, 16, 18, 20, 11, 10]
    }

    public static int nodeDepths(TreeNode root) {

        return nodeDepthSum(root, 0);
    }

    public static int nodeDepthSum(TreeNode node, int sum){
        if(node == null){
            return 0;
        }

        int leftDepth = nodeDepthSum(node.left, sum);
        int rightDepth = nodeDepthSum(node.right, sum);

        sum += Math.max(leftDepth, rightDepth);

        return Math.max(leftDepth, rightDepth);
    }

    private static TreeNode buildTree(List<BranchSum.NodeData> nodes, String rootId) {
        Map<String, TreeNode> nodeMap = new HashMap<>();

        // Create all nodes
        for (BranchSum.NodeData node : nodes) {
            nodeMap.put(node.id, new TreeNode(node.value));
        }

        // Link nodes
        for (BranchSum.NodeData node : nodes) {
            TreeNode current = nodeMap.get(node.id);
            if (node.left != null) {
                current.left = nodeMap.get(node.left);
            }
            if (node.right != null) {
                current.right = nodeMap.get(node.right);
            }
        }

        return nodeMap.get(rootId);
    }

    static class NodeData {
        String id;
        String left;
        String right;
        int value;

        NodeData(String id, String left, String right, int value) {
            this.id = id;
            this.left = left;
            this.right = right;
            this.value = value;
        }
    }

}
