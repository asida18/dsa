/**
 * MEDIUM - Sort Colors (Dutch National Flag)
 * https://leetcode.com/problems/sort-colors/
 *
 * Problem:
 *   Given an array with values 0, 1, 2 (representing red, white, blue),
 *   sort in-place so all 0s come first, then 1s, then 2s. One pass, O(1) space.
 *
 * Example:
 *   Input:  nums = [2, 0, 2, 1, 1, 0]
 *   Output: [0, 0, 1, 1, 2, 2]
 *
 * Approach: (your notes here)
 *   - nums[mid] === 0: swap with lo, advance both lo and mid
 *   - nums[mid] === 2: swap with hi, shrink hi (don't advance mid)
 *   - nums[mid] === 1: advance mid
 *
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */

function sortColors(nums) {
  // TODO: implement

}

// --- Tests ---
const assert = (condition, msg) => { if (!condition) throw new Error(msg); };

const a1 = [2,0,2,1,1,0]; sortColors(a1);
assert(JSON.stringify(a1) === JSON.stringify([0,0,1,1,2,2]), "Test 1 failed");

const a2 = [2,0,1]; sortColors(a2);
assert(JSON.stringify(a2) === JSON.stringify([0,1,2]), "Test 2 failed");

const a3 = [0]; sortColors(a3);
assert(JSON.stringify(a3) === JSON.stringify([0]), "Test 3 failed");

console.log("All tests passed!");
