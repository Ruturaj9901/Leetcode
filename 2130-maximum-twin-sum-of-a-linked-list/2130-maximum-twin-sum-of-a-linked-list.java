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
    public ListNode reversList(ListNode head){
        ListNode prve=null;
        ListNode curr=head;
        ListNode after=null;

        while( curr != null){
            after=curr.next;
            curr.next=prve;
            prve=curr;
            curr=after;
        }
        return prve;
    }
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int max = Integer.MIN_VALUE;


        while( fast.next!= null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=reversList(slow.next);
        slow.next=temp;

        ListNode p1=head;
        ListNode p2=slow.next;

        while( p2 != null){
            int sum=p1.val+p2.val;
            if( max < sum){
                max=sum;
            }
               p1=p1.next;
                p2=p2.next;
        }
        return max;
    }
}