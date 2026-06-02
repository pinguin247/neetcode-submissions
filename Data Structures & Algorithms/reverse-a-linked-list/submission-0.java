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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head; //If only 1 or 0 nodes
        ListNode tmp = head;
        ListNode curr = head.next;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = tmp;
            tmp = curr;
            curr = next;
        }
        head.next = null;
        head = tmp;
        return head;
    }
}
