/**
 * HARD - Find Minimum in Rotated Sorted Array II (with duplicates)
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
 *
 * Problem:
 *   A sorted array was rotated at some unknown pivot. It may contain duplicates.
 *   Find and return the minimum element.
 *
 * Example:
 *   Input:  nums = [2, 2, 2, 0, 1]
 *   Output: 0
 *
 * Approach: (your notes here)
 *
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */
public class FindMinRotatedSortedArrayII {
    public int findMin(int[] nums) {
        // TODO: implement
        return 0;
    }

    // --- Tests ---
    public static void main(String[] args) {
        FindMinRotatedSortedArrayII sol = new FindMinRotatedSortedArrayII();

        assert sol.findMin(new int[]{2,2,2,0,1})     == 0 : "Test 1 failed";
        assert sol.findMin(new int[]{1,3,5})          == 1 : "Test 2 failed";
        assert sol.findMin(new int[]{3,1,3,3,3})     == 1 : "Test 3 failed";
        assert sol.findMin(new int[]{4,5,6,7,0,1,2}) == 0 : "Test 4 failed";

        System.out.println("All tests passed!");
    }
}
