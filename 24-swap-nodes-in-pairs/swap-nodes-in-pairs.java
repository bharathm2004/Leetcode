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
    public ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        while(temp!=null && temp.next!=null)
        {
            swap(temp,temp.next);
            temp=temp.next.next;
        }
        return  head;
        
    }
    public static void swap(ListNode a, ListNode b)
    {
        int temp = a.val;
        a.val=b.val;
        b.val=temp;
    }
}