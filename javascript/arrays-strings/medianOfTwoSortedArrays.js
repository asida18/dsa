/**
 * HARD - Median of Two Sorted Arrays
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 *
 * Problem:
 *   Given two sorted arrays nums1 and nums2, return the median of the two arrays.
 *   Must run in O(log(m + n)) time.
 *
 * Example:
 *   Input:  nums1 = [1, 3], nums2 = [2]
 *   Output: 2.0
 *
 * Approach: (your notes here)
 *   The median sits at the boundary of the correct partition.
 *
 * Time Complexity:  O(?))) — binary search on the smaller array
 * Space Complexity: O(?)
 */

function findMedianSortedArrays(nums1, nums2) {
  // TODO: implement

}

// --- Tests ---
const assert = (condition, msg) => { if (!condition) throw new Error(msg); };

assert(findMedianSortedArrays([1, 3], [2])      === 2,   "Test 1 failed");
assert(findMedianSortedArrays([1, 2], [3, 4])   === 2.5, "Test 2 failed");
assert(findMedianSortedArrays([], [1])           === 1,   "Test 3 failed");
assert(findMedianSortedArrays([0, 0], [0, 0])   === 0,   "Test 4 failed");

console.log("All tests passed!");
