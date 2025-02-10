package BinaryTree;

// https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/
public class CountNodesEqualToAverageSubTree {

    public int averageOfSubtree(TreeNode root) {
        
        int[] count = new int[1];
        subTreeAverage(root, count);
        return count[0];
    }

    public int[] subTreeAverage(TreeNode node, int[] count) {
        if (node == null) return new int[]{0, 0};

        int[] left = subTreeAverage(node, count);
        int[] right = subTreeAverage(node, count);

        int sum = left[0] + right[0] + node.data;
        int totalCount = left[1] + right[1] + 1;
        // +1 is for the current node, and left[1], right[1] is for its children

        if (sum / totalCount == node.data) {
            count[0]++;
        }

        return new int[]{sum, totalCount};
    }
}