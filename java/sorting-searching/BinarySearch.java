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
public class BinarySearch {
    public int search(int[] nums, int target) {
        // TODO: implement
        return -1;
    }

    // --- Tests ---
    public static void main(String[] args) {
        BinarySearch sol = new BinarySearch();

        assert sol.search(new int[]{-1,0,3,5,9,12}, 9)  == 4  : "Test 1 failed";
        assert sol.search(new int[]{-1,0,3,5,9,12}, 2)  == -1 : "Test 2 failed";
        assert sol.search(new int[]{5}, 5)               == 0  : "Test 3 failed";
        assert sol.search(new int[]{1,2,3,4,5}, 1)      == 0  : "Test 4 failed";

        System.out.println("All tests passed!");
    }
}
