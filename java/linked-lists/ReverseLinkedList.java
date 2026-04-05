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
public class ReverseLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode reverseList(ListNode head) {
        // TODO: implement
        return null;
    }

    // --- Helpers ---
    private static ListNode build(int... vals) {
        ListNode dummy = new ListNode(0); ListNode cur = dummy;
        for (int v : vals) { cur.next = new ListNode(v); cur = cur.next; }
        return dummy.next;
    }
    private static int[] toArray(ListNode head) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (head != null) { list.add(head.val); head = head.next; }
        return list.stream().mapToInt(i -> i).toArray();
    }

    // --- Tests ---
    public static void main(String[] args) {
        ReverseLinkedList sol = new ReverseLinkedList();

        assert java.util.Arrays.equals(toArray(sol.reverseList(build(1,2,3,4,5))), new int[]{5,4,3,2,1}) : "Test 1 failed";
        assert java.util.Arrays.equals(toArray(sol.reverseList(build(1,2))),        new int[]{2,1})       : "Test 2 failed";
        assert sol.reverseList(null) == null : "Test 3 failed";

        System.out.println("All tests passed!");
    }
}
