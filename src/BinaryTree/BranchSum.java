package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BranchSum {

    public static void main(String[] args) {
        // Define the tree structure
        List<NodeData> nodes = List.of(
                new NodeData("1", "2", "3", 1),
                new NodeData("2", "4", "5", 2),
                new NodeData("3", "6", "7", 3),
                new NodeData("4", "8", "9", 4),
                new NodeData("5", "10", null, 5),
                new NodeData("6", null, null, 6),
                new NodeData("7", null, null, 7),
                new NodeData("8", null, null, 8),
                new NodeData("9", null, null, 9),
                new NodeData("10", null, null, 10)
        );

        TreeNode root = buildTree(nodes, "1");

        // Get branch sums
        List<Integer> result = branchSums(root);
        System.out.println(result); // Expected Output: [15, 16, 18, 20, 11, 10]
    }

    public static List<Integer> branchSums(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        calculateBranchSum(root, 0, ans);
        return ans;
    }

    private static void calculateBranchSum(TreeNode node, int sum, List<Integer> ans) {
        if (node == null) {
            return;
        }

        sum += node.data;

        // If it's a leaf node, add the sum to the answer list
        if (node.left == null && node.right == null) {
            ans.add(sum);
            return;
        }

        calculateBranchSum(node.left, sum, ans);
        calculateBranchSum(node.right, sum, ans);
    }

    private static TreeNode buildTree(List<NodeData> nodes, String rootId) {
        Map<String, TreeNode> nodeMap = new HashMap<>();

        // Create all nodes
        for (NodeData node : nodes) {
            nodeMap.put(node.id, new TreeNode(node.value));
        }

        // Link nodes
        for (NodeData node : nodes) {
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
