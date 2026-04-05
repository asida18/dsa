/**
 * HARD - Merge K Sorted Lists
 * https://leetcode.com/problems/merge-k-sorted-lists/
 *
 * Problem:
 *   Given an array of k linked lists, each sorted in ascending order,
 *   merge all lists into one sorted linked list and return it.
 *
 * Example:
 *   Input:  lists = [[1,4,5],[1,3,4],[2,6]]
 *   Output: [1,1,2,3,4,4,5,6]
 *
 * Approach: (your notes here)
 *   (Note: JS lacks a built-in min-heap; divide & conquer avoids the need for one.)
 *
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */

function mergeKLists(lists) {
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

const lists1 = [buildList(1,4,5), buildList(1,3,4), buildList(2,6)];
assert(JSON.stringify(toArray(mergeKLists(lists1))) === JSON.stringify([1,1,2,3,4,4,5,6]), "Test 1 failed");

assert(mergeKLists([]) === null, "Test 2 failed");
assert(mergeKLists([null]) === null, "Test 3 failed");

console.log("All tests passed!");
