/**
 * HARD - Merge K Sorted Lists
 * https://leetcode.com/problems/merge-k-sorted-lists/
 *
 * Problem:
 *   Given an array of k linked lists each sorted in ascending order,
 *   merge all into one sorted linked list and return it.
 *
 * Example:
 *   Input:  lists = [[1,4,5],[1,3,4],[2,6]]
 *   Output: [1,1,2,3,4,4,5,6]
 *
 * Approach: (your notes here)
 *
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */
public class MergeKSortedLists {
    static class ListNode {
        int val; ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
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
        MergeKSortedLists sol = new MergeKSortedLists();

        ListNode[] lists1 = { build(1,4,5), build(1,3,4), build(2,6) };
        assert java.util.Arrays.equals(toArray(sol.mergeKLists(lists1)), new int[]{1,1,2,3,4,4,5,6}) : "Test 1 failed";
        assert sol.mergeKLists(new ListNode[]{}) == null : "Test 2 failed";

        System.out.println("All tests passed!");
    }
}
