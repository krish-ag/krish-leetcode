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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode ans = new ListNode();
        ListNode curr = ans;
        for (int i = 1; i < left; i++) {
            if (head == null) break;
            curr.val = head.val;
            if (i < left - 1) {
                curr.next = new ListNode();
                curr = curr.next;
            }
            head = head.next;
        }
        ListNode x = new ListNode();
        ListNode last = null;
        for (int i = left; i <= right; i++) {
            if (head == null) break;
            ListNode temp = new ListNode(head.val);
            if (i == left) last = temp;
            temp.next = x.next;
            x.next = temp;
            head = head.next;
        }
        curr.next = x.next;

        while (head != null && last != null) {
            last.next = new ListNode(head.val);
            last = last.next;
            head = head.next;
        }
        if (left == 1) ans = ans.next;

        return ans;
    }
}