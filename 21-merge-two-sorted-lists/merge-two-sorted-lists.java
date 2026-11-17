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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if(head1==null || head2==null){
            return head1==null ? head2 : head1;
        }
        if(head1.val <= head2.val){
            head1.next = mergeTwoLists(head1.next,head2);
            return head1;
        }else{
            head2.next = mergeTwoLists(head1,head2.next);
            return head2;
        }




















        // ListNode temp1=list1;
        // ListNode temp2=list2;
        // ListNode head=new ListNode(100);
        // ListNode temp=head;
        // while(temp1 != null && temp2 !=null){
        //     if(temp1.val<temp2.val){
        //         ListNode a=new ListNode(temp1.val);
        //         temp.next=a;
        //         temp=a;
        //         temp1=temp1.next;
        //     }else{
        //          ListNode a=new ListNode(temp2.val);
        //         temp.next=a;
        //         temp=a;
        //         temp2=temp2.next;
        //     }
        // }if(temp1==null){
        //     temp.next=temp2;
        // }else{
        //     temp.next=temp1;
        // }
        // return head.next;
    }
}