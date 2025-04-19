/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private int count = 0;

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        remove(dummy, n);
        return dummy.next;
    }

    private ListNode remove(ListNode node, int n) {
        if (node == null) return null;

        node.next = remove(node.next, n);
        count++;

        if (count == n + 1) {
            node.next = node.next.next;
        }

        return node;
    }
}
