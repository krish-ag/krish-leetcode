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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode x = head;
        while (x != null) {
            count++;
            x = x.next;
        }

        int idx = count - n;

        if (idx == 0) {
            return head != null ? head.next: null;
        }

        x = head;
        while (idx > 1) {
            x = x.next;
            idx--;
        }
        x.next = x.next.next;
        

        return head;
    }
}