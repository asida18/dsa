/**
 * MEDIUM - Sort Colors (Dutch National Flag)
 * https://leetcode.com/problems/sort-colors/
 *
 * Problem:
 *   Given an array with values 0, 1, 2, sort in-place so all 0s come first,
 *   then 1s, then 2s. Must be done in one pass with O(1) space.
 *
 * Example:
 *   Input:  nums = [2, 0, 2, 1, 1, 0]
 *   Output: [0, 0, 1, 1, 2, 2]
 *
 * Approach: (your notes here)
 *
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */
public class SortColors {
    public void sortColors(int[] nums) {
        // TODO: implement
    }

    // --- Tests ---
    public static void main(String[] args) {
        SortColors sol = new SortColors();

        int[] a1 = {2,0,2,1,1,0}; sol.sortColors(a1);
        assert java.util.Arrays.equals(a1, new int[]{0,0,1,1,2,2}) : "Test 1 failed";

        int[] a2 = {2,0,1}; sol.sortColors(a2);
        assert java.util.Arrays.equals(a2, new int[]{0,1,2}) : "Test 2 failed";

        System.out.println("All tests passed!");
    }
}
