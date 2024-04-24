/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lA = len(headA);
        int lB = len(headB);
        int max = Math.max(lA, lB);
        int diff = Math.abs(lA-lB);
        ListNode maxNode = headB;
        ListNode minNode = headA;
        if (lA == max) {
            maxNode = headA;
            minNode = headB;
        }

        for (int i = 0; i < diff; i++){
            maxNode = maxNode.next;
        }
        for (int i = 0; i < max - diff; i++){
            if (maxNode == minNode) {
                return maxNode;
            }
            maxNode = maxNode.next;
            minNode = minNode.next;
        }
        return null;
    }

    public static int len(ListNode head){
        if (head == null) return 0;
        return 1+len(head.next);
    }
}