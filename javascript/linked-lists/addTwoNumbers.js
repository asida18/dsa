/**
 * MEDIUM - Add Two Numbers
 * https://leetcode.com/problems/add-two-numbers/
 *
 * Problem:
 *   Two non-empty linked lists represent two non-negative integers stored in reverse order.
 *   Each node contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 * Example:
 *   Input:  l1 = [2,4,3], l2 = [5,6,4]   (represents 342 + 465)
 *   Output: [7,0,8]                        (represents 807)
 *
 * Approach: (your notes here)
 *
 * Time Complexity:  O(?)) — process each digit once
 * Space Complexity: O(?)) — result list length is at most max(m, n) + 1
 */

function addTwoNumbers(l1, l2) {
  // TODO: implement

}

// --- Helpers ---
function buildList(...vals) {
  let dummy = { val: 0, next: null };
  let cur = dummy;
  for (const v of vals) { cur.next = { val: v, next: null }; cur = cur.next; }
  return dummy.next;
}

function toArray(head) {
  const result = [];
  while (head) { result.push(head.val); head = head.next; }
  return result;
}

// --- Tests ---
const assert = (condition, msg) => { if (!condition) throw new Error(msg); };

// 342 + 465 = 807
assert(JSON.stringify(toArray(addTwoNumbers(buildList(2,4,3), buildList(5,6,4)))) === JSON.stringify([7,0,8]),     "Test 1 failed");
// 0 + 0 = 0
assert(JSON.stringify(toArray(addTwoNumbers(buildList(0), buildList(0))))         === JSON.stringify([0]),         "Test 2 failed");
// 999 + 1 = 1000
assert(JSON.stringify(toArray(addTwoNumbers(buildList(9,9,9), buildList(1))))     === JSON.stringify([0,0,0,1]),   "Test 3 failed");

console.log("All tests passed!");
