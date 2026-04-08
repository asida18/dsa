/**
 * EASY - Two Sum
 * https://leetcode.com/problems/two-sum/
 *
 * Problem:
 *   Given an array of integers nums and an integer target, return indices of
 *   the two numbers that add up to target. Exactly one solution guaranteed.
 *
 * Example:
 *   Input:  nums = [2, 7, 11, 15], target = 9
 *   Output: [0, 1]
 *
 * Approach: (your notes here)
 *
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */

// Brute force solution
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// function twoSum(nums, target) {
//   for (var i = 0; i < nums.length; i++) {
//     for (var j = i + 1; j < nums.length; j++) {
//       if (nums[i] + nums[j] === target) {
//         return [i, j];
//       }
//     }
//   }
//   return [];
// }

// Map/hash table solution
// Time Complexity: O(n)
// Space Complexity: O(n)
function twoSum(nums, target) {
  const map = new Map();

  for (let i = 0; i < nums.length; i++) {
    const complement = target - nums[i];
    if (map.has(complement)) return [map.get(complement), i];
    map.set(nums[i], i);
  }

  throw new Error("No solution found");
}


// --- Tests ---
const assert = (condition, msg) => { if (!condition) throw new Error(msg); };

const r1 = twoSum([2, 7, 11, 15], 9);
assert(r1[0] === 0 && r1[1] === 1, "Test 1 failed");

const r2 = twoSum([3, 2, 4], 6);
assert(r2[0] === 1 && r2[1] === 2, "Test 2 failed");

const r3 = twoSum([3, 3], 6);
assert(r3[0] === 0 && r3[1] === 1, "Test 3 failed");

console.log("All tests passed!");
