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

function maxDepth(root) {
  // TODO: implement

}

// --- Helpers ---
function buildTree(val, left = null, right = null) {
  return { val, left, right };
}

// --- Tests ---
const assert = (condition, msg) => { if (!condition) throw new Error(msg); };

// Tree: [3, 9, 20, null, null, 15, 7]
const root1 = buildTree(3,
  buildTree(9),
  buildTree(20, buildTree(15), buildTree(7))
);
assert(maxDepth(root1) === 3, "Test 1 failed");

// Tree: [1, null, 2]
const root2 = buildTree(1, null, buildTree(2));
assert(maxDepth(root2) === 2, "Test 2 failed");

assert(maxDepth(null) === 0, "Test 3 failed");

console.log("All tests passed!");
