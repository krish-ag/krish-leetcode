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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode headB = mid.next;
        mid.next=null;
        ListNode A = sortList(head);
        ListNode B = sortList(headB);
        return mergeTwoLists(A, B);
    }

    public static ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode Dummy = new ListNode();
        ListNode Head = Dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                Dummy.next = list1;
                Dummy = Dummy.next;
                list1 = list1.next;
            } else {
                Dummy.next = list2;
                Dummy = Dummy.next;
                list2 = list2.next;
            }
        }
        if (list1 == null) {
            Dummy.next = list2;
        } else {
            Dummy.next = list1;
        }
        return Head.next;
    }
}
