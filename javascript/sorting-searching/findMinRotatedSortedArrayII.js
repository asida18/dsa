/**
 * HARD - Find Minimum in Rotated Sorted Array II (with duplicates)
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
 *
 * Problem:
 *   A sorted array was rotated at some unknown pivot. The array may contain duplicates.
 *   Find the minimum element.
 *
 * Example:
 *   Input:  nums = [2, 2, 2, 0, 1]
 *   Output: 0
 *
 * Approach: (your notes here)
 *   - nums[mid] > nums[hi]: min is in right half (excluding mid)
 *   - nums[mid] === nums[hi]: can't determine side — shrink hi by 1 safely
 *
 * Time Complexity:  O(?) average, O(n) worst case with all duplicates
 * Space Complexity: O(?)
 */

function findMin(nums) {
  // TODO: implement

}

// --- Tests ---
const assert = (condition, msg) => { if (!condition) throw new Error(msg); };

assert(findMin([2,2,2,0,1])     === 0, "Test 1 failed");
assert(findMin([1,3,5])         === 1, "Test 2 failed");
assert(findMin([3,1,3,3,3])     === 1, "Test 3 failed");
assert(findMin([1,1,1,1])       === 1, "Test 4 failed");
assert(findMin([4,5,6,7,0,1,2]) === 0, "Test 5 failed");

console.log("All tests passed!");
