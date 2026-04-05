/**
 * HARD - Edit Distance
 * https://leetcode.com/problems/edit-distance/
 *
 * Problem:
 *   Given two strings word1 and word2, return the minimum number of operations
 *   to convert word1 to word2. Operations: insert, delete, or replace a character.
 *
 * Example:
 *   Input:  word1 = "horse", word2 = "ros"
 *   Output: 3  (horse → rorse → rose → ros)
 *
 * Approach: (your notes here)
 *
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */
public class EditDistance {
    public int minDistance(String word1, String word2) {
        // TODO: implement
        return 0;
    }

    // --- Tests ---
    public static void main(String[] args) {
        EditDistance sol = new EditDistance();

        assert sol.minDistance("horse", "ros")           == 3 : "Test 1 failed";
        assert sol.minDistance("intention", "execution") == 5 : "Test 2 failed";
        assert sol.minDistance("", "")                   == 0 : "Test 3 failed";
        assert sol.minDistance("a", "")                  == 1 : "Test 4 failed";
        assert sol.minDistance("abc", "abc")             == 0 : "Test 5 failed";

        System.out.println("All tests passed!");
    }
}
