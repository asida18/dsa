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
 *
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // TODO: implement
        return 0.0;
    }

    // --- Tests ---
    public static void main(String[] args) {
        MedianOfTwoSortedArrays sol = new MedianOfTwoSortedArrays();

        assert sol.findMedianSortedArrays(new int[]{1,3}, new int[]{2})   == 2.0 : "Test 1 failed";
        assert sol.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}) == 2.5 : "Test 2 failed";
        assert sol.findMedianSortedArrays(new int[]{}, new int[]{1})      == 1.0 : "Test 3 failed";
        assert sol.findMedianSortedArrays(new int[]{0,0}, new int[]{0,0}) == 0.0 : "Test 4 failed";

        System.out.println("All tests passed!");
    }
}
