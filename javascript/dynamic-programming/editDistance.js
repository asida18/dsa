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
 *   - Else: dp[i][j] = 1 + min(replace, delete, insert)
 *
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */

function minDistance(word1, word2) {
  // TODO: implement

}

// --- Tests ---
const assert = (condition, msg) => { if (!condition) throw new Error(msg); };

assert(minDistance("horse", "ros")           === 3, "Test 1 failed");
assert(minDistance("intention", "execution") === 5, "Test 2 failed");
assert(minDistance("", "")                   === 0, "Test 3 failed");
assert(minDistance("a", "")                  === 1, "Test 4 failed");
assert(minDistance("abc", "abc")             === 0, "Test 5 failed");

console.log("All tests passed!");
