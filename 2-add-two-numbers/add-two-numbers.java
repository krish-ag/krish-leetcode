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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode ans = head;
        ListNode x = l1;
        ListNode y = l2;
        int carry = 0;
        while (x != null || y != null) {
            int a = x != null ? x.val : 0;
            int b = y != null ? y.val : 0;
            ans.val = (a + b + carry) % 10;
            carry = (a + b + carry) / 10;
            if ((x != null && x.next != null) || y != null && y.next != null) {
                ans.next = new ListNode();
                ans = ans.next;
            }
            x = x != null? x.next: null;
            y = y != null ? y.next: null;

        }

        if (carry > 0) {
            ans.next = new ListNode(carry);
        }


        return head;
    }
}