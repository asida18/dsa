/**
 * EASY - Reverse Linked List
 * https://leetcode.com/problems/reverse-linked-list/
 *
 * Problem:
 *   Given the head of a singly linked list, reverse the list and return the new head.
 *
 * Example:
 *   Input:  1 → 2 → 3 → 4 → 5
 *   Output: 5 → 4 → 3 → 2 → 1
 *
 * Approach: (your notes here)
 *
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */

function reverseList(head) {
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

assert(JSON.stringify(toArray(reverseList(buildList(1,2,3,4,5)))) === JSON.stringify([5,4,3,2,1]), "Test 1 failed");
assert(JSON.stringify(toArray(reverseList(buildList(1,2))))       === JSON.stringify([2,1]),       "Test 2 failed");
assert(reverseList(null) === null, "Test 3 failed");

console.log("All tests passed!");
