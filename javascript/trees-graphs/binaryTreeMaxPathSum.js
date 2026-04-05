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

function maxPathSum(root) {
  // TODO: implement

}

// --- Helpers ---
function buildTree(val, left = null, right = null) {
  return { val, left, right };
}

// --- Tests ---
const assert = (condition, msg) => { if (!condition) throw new Error(msg); };

const root1 = buildTree(1, buildTree(2), buildTree(3));
assert(maxPathSum(root1) === 6, "Test 1 failed");

const root2 = buildTree(-10, buildTree(9), buildTree(20, buildTree(15), buildTree(7)));
assert(maxPathSum(root2) === 42, "Test 2 failed");

const root3 = buildTree(-3);
assert(maxPathSum(root3) === -3, "Test 3 failed");

console.log("All tests passed!");
