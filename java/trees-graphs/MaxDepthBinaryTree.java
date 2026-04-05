/**
 * EASY - Maximum Depth of Binary Tree
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 *
 * Problem:
 *   Given the root of a binary tree, return its maximum depth.
 *   Maximum depth = number of nodes along the longest path from root to a leaf.
 *
 * Example:
 *   Input:  root = [3, 9, 20, null, null, 15, 7]
 *   Output: 3
 *
 * Approach: (your notes here)
 *
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */
public class MaxDepthBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public int maxDepth(TreeNode root) {
        // TODO: implement
        return 0;
    }

    // --- Tests ---
    public static void main(String[] args) {
        MaxDepthBinaryTree sol = new MaxDepthBinaryTree();

        TreeNode root1 = new TreeNode(3);
        root1.left  = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left  = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        assert sol.maxDepth(root1) == 3 : "Test 1 failed";

        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);
        assert sol.maxDepth(root2) == 2 : "Test 2 failed";

        assert sol.maxDepth(null) == 0 : "Test 3 failed";

        System.out.println("All tests passed!");
    }
}
