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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode i=l1;
        ListNode j=l2;
        ListNode dummy = new ListNode(0);
ListNode tail = dummy;
int carry=0;
while(i!=null || j!=null || carry!=0){
int val1=0;
int val2=0;
    if(i!=null){
        val1=i.val;
    }
    if(j!=null){
        val2=j.val;
    }
   int sum=val1+val2+carry;
   
    int digit=sum%10;
    carry=sum/10;
    tail.next=new ListNode(digit);
    tail=tail.next;
    
   if(i!=null){
    i=i.next;
   }
   if(j!=null){
    j=j.next;
   }
  
    
}

return dummy.next;
    }
}