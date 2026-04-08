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
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // Brute force solution
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // public int[] twoSum(int[] nums, int target) {
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[i] + nums[j] == target) {
    //                 return new int[]{i, j};
    //             }
    //         }
    //     }
    //     return new int[]{};
    // }

    // Map/hash table solution
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    // --- Tests ---
    public static void main(String[] args) {
        TwoSum sol = new TwoSum();

        int[] r1 = sol.twoSum(new int[]{2, 7, 11, 15}, 9);
        assert r1[0] == 0 && r1[1] == 1 : "Test 1 failed";

        int[] r2 = sol.twoSum(new int[]{3, 2, 4}, 6);
        assert r2[0] == 1 && r2[1] == 2 : "Test 2 failed";

        int[] r3 = sol.twoSum(new int[]{3, 3}, 6);
        assert r3[0] == 0 && r3[1] == 1 : "Test 3 failed";

        System.out.println("All tests passed!");
    }
}
