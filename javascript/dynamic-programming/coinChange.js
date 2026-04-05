/**
 * MEDIUM - Coin Change
 * https://leetcode.com/problems/coin-change/
 *
 * Problem:
 *   Given an array of coin denominations and a target amount, return the fewest number
 *   of coins needed to make up that amount. Return -1 if it cannot be done.
 *
 * Example:
 *   Input:  coins = [1, 5, 10, 25], amount = 36
 *   Output: 3  (25 + 10 + 1)
 *
 * Approach: (your notes here)
 *
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */

function coinChange(coins, amount) {
  // TODO: implement

}

// --- Tests ---
const assert = (condition, msg) => { if (!condition) throw new Error(msg); };

assert(coinChange([1, 5, 10, 25], 36) === 3,  "Test 1 failed");
assert(coinChange([1, 2, 5], 11)      === 3,  "Test 2 failed");
assert(coinChange([2], 3)             === -1, "Test 3 failed");
assert(coinChange([1], 0)             === 0,  "Test 4 failed");

console.log("All tests passed!");
