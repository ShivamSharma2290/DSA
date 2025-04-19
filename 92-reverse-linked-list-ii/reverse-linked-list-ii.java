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
import java.util.Stack;

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        int pos = 1;

        // Step 1: Push values between left and right onto the stack
        while (temp != null) {
            if (pos >= left && pos <= right) {
                stack.push(temp.val);
            }
            temp = temp.next;
            pos++;
        }

        // Step 2: Traverse again and pop values into the same nodes
        temp = head;
        pos = 1;
        while (temp != null) {
            if (pos >= left && pos <= right) {
                temp.val = stack.pop();
            }
            temp = temp.next;
            pos++;
        }

        return head;
    }
}
