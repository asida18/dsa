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
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */
public class AddTwoNumbers {
    static class ListNode {
        int val; ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
        AddTwoNumbers sol = new AddTwoNumbers();

        assert java.util.Arrays.equals(toArray(sol.addTwoNumbers(build(2,4,3), build(5,6,4))), new int[]{7,0,8})    : "Test 1 failed";
        assert java.util.Arrays.equals(toArray(sol.addTwoNumbers(build(0), build(0))),         new int[]{0})         : "Test 2 failed";
        assert java.util.Arrays.equals(toArray(sol.addTwoNumbers(build(9,9,9), build(1))),     new int[]{0,0,0,1})  : "Test 3 failed";

        System.out.println("All tests passed!");
    }
}
