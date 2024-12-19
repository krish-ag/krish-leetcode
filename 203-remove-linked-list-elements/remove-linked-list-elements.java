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
    public ListNode removeElements(ListNode head, int val) {
        ListNode h = new ListNode(-1, head);
        head = h;
        while (h.next != null) {
            if (h.next.val == val) {
                h.next = h.next.next;
            } else {
                h = h.next;
            }
        }
        return head.next;

    }

}