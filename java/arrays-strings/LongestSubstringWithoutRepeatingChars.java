/**
 * MEDIUM - Longest Substring Without Repeating Characters
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * Problem:
 *   Given a string s, find the length of the longest substring without repeating characters.
 *
 * Example:
 *   Input:  s = "abcabcbb"
 *   Output: 3  ("abc")
 *
 * Approach: (your notes here)
 *
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        // TODO: implement
        return 0;
    }

    // --- Tests ---
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingChars sol = new LongestSubstringWithoutRepeatingChars();

        assert sol.lengthOfLongestSubstring("abcabcbb") == 3 : "Test 1 failed";
        assert sol.lengthOfLongestSubstring("bbbbb")    == 1 : "Test 2 failed";
        assert sol.lengthOfLongestSubstring("pwwkew")   == 3 : "Test 3 failed";
        assert sol.lengthOfLongestSubstring("")         == 0 : "Test 4 failed";

        System.out.println("All tests passed!");
    }
}
