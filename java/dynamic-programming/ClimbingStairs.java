/**
 * EASY - Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/
 *
 * Problem:
 *   You are climbing a staircase with n steps. Each time you can climb 1 or 2 steps.
 *   In how many distinct ways can you climb to the top?
 *
 * Example:
 *   Input:  n = 3
 *   Output: 3  (1+1+1, 1+2, 2+1)
 *
 * Approach: (your notes here)
 *
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        // TODO: implement
        return 0;
    }

    // --- Tests ---
    public static void main(String[] args) {
        ClimbingStairs sol = new ClimbingStairs();

        assert sol.climbStairs(1)  == 1  : "Test 1 failed";
        assert sol.climbStairs(2)  == 2  : "Test 2 failed";
        assert sol.climbStairs(3)  == 3  : "Test 3 failed";
        assert sol.climbStairs(5)  == 8  : "Test 4 failed";
        assert sol.climbStairs(10) == 89 : "Test 5 failed";

        System.out.println("All tests passed!");
    }
}
