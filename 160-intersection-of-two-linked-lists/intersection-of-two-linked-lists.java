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
        ListNode K = headA;
        ListNode P = headB;
        while (K != P) {
            if (K == null) {
                K = headB;
            }
            else {
                K = K.next;
            }
            if (P == null){
                P = headA;
            }
            else {
                P = P.next;
            }
        }
        return K;
    }
}