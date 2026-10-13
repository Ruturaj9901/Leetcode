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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode temp=head;
        int size=1;

        while( temp.next!=null){
            temp=temp.next;
            size++;
        }

        temp.next=head;

        k=k%size;

        int step=size-k;
        ListNode newlast=head;

        for(int i=1; i<step; i++){
            newlast=newlast.next;
        }

        ListNode newhead=newlast.next;
        newlast.next=null;

        return newhead;

    }
}