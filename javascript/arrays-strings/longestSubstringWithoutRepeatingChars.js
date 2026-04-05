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
 * Space Complexity: O(?)) — m = character set size
 */

function lengthOfLongestSubstring(s) {
  // TODO: implement

}

// --- Tests ---
const assert = (condition, msg) => { if (!condition) throw new Error(msg); };

assert(lengthOfLongestSubstring("abcabcbb") === 3, "Test 1 failed");
assert(lengthOfLongestSubstring("bbbbb")    === 1, "Test 2 failed");
assert(lengthOfLongestSubstring("pwwkew")   === 3, "Test 3 failed");
assert(lengthOfLongestSubstring("")         === 0, "Test 4 failed");

console.log("All tests passed!");
