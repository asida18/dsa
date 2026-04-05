/**
 * HARD - Binary Tree Maximum Path Sum
 * https://leetcode.com/problems/binary-tree-maximum-path-sum/
 *
 * Problem:
 *   A path in a binary tree is a sequence of nodes where each pair of adjacent nodes
 *   has an edge. Return the maximum sum of any path. Path need not pass through root.
 *
 * Example:
 *   Input:  root = [-10, 9, 20, null, null, 15, 7]
 *   Output: 42  (path: 15 → 20 → 7)
 *
 * Approach: (your notes here)
 *
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */
public class BinaryTreeMaxPathSum {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public int maxPathSum(TreeNode root) {
        // TODO: implement
        return 0;
    }

    // --- Tests ---
    public static void main(String[] args) {
        BinaryTreeMaxPathSum sol = new BinaryTreeMaxPathSum();

        TreeNode root1 = new TreeNode(1);
        root1.left  = new TreeNode(2);
        root1.right = new TreeNode(3);
        assert sol.maxPathSum(root1) == 6 : "Test 1 failed";

        TreeNode root2 = new TreeNode(-10);
        root2.left  = new TreeNode(9);
        root2.right = new TreeNode(20);
        root2.right.left  = new TreeNode(15);
        root2.right.right = new TreeNode(7);
        assert sol.maxPathSum(root2) == 42 : "Test 2 failed";

        TreeNode root3 = new TreeNode(-3);
        assert sol.maxPathSum(root3) == -3 : "Test 3 failed";

        System.out.println("All tests passed!");
    }
}
