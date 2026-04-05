/**
 * EASY - Binary Search
 * https://leetcode.com/problems/binary-search/
 *
 * Problem:
 *   Given a sorted array of distinct integers and a target, return the index of target.
 *   If not found, return -1. Must run in O(log n).
 *
 * Example:
 *   Input:  nums = [-1, 0, 3, 5, 9, 12], target = 9
 *   Output: 4
 *
 * Approach: (your notes here)
 *
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */

function search(nums, target) {
  // TODO: implement

}

// --- Tests ---
const assert = (condition, msg) => { if (!condition) throw new Error(msg); };

assert(search([-1,0,3,5,9,12], 9)  === 4,  "Test 1 failed");
assert(search([-1,0,3,5,9,12], 2)  === -1, "Test 2 failed");
assert(search([5], 5)               === 0,  "Test 3 failed");
assert(search([1,2,3,4,5], 1)      === 0,  "Test 4 failed");
assert(search([1,2,3,4,5], 5)      === 4,  "Test 5 failed");

console.log("All tests passed!");
