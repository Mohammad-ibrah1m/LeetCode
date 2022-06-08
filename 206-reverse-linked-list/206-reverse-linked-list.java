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
        if(head == null)
        return null;
        ListNode prev = null;
        ListNode current = head;
        ListNode after = current.next;
        while(current != null){
            current.next = prev;
            prev = current;
            current = after;
            if(after != null)
            after = after.next;
        }
        return prev;
    }
}