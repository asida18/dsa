/**
 * MEDIUM - Number of Islands
 * https://leetcode.com/problems/number-of-islands/
 *
 * Problem:
 *   Given an m x n 2D grid of '1's (land) and '0's (water), return the number of islands.
 *   An island is formed by connecting adjacent lands horizontally/vertically.
 *
 * Example:
 *   Input:  grid = [["1","1","0"],
 *                   ["0","1","0"],
 *                   ["0","0","1"]]
 *   Output: 2
 *
 * Approach: (your notes here)
 *
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */

function numIslands(grid) {
  // TODO: implement

}

// --- Tests ---
const assert = (condition, msg) => { if (!condition) throw new Error(msg); };

const grid1 = [['1','1','1','1','0'],['1','1','0','1','0'],['1','1','0','0','0'],['0','0','0','0','0']];
assert(numIslands(grid1) === 1, "Test 1 failed");

const grid2 = [['1','1','0','0','0'],['1','1','0','0','0'],['0','0','1','0','0'],['0','0','0','1','1']];
assert(numIslands(grid2) === 3, "Test 2 failed");

console.log("All tests passed!");
