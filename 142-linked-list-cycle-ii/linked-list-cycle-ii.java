/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            //cycle detected
            if(fast==slow)
            {
                ListNode entry = head;
                while(entry != slow)
                {
                    slow=slow.next;
                    entry=entry.next;
                }
                return slow;
            }
        }
        
        return null;

    }
}