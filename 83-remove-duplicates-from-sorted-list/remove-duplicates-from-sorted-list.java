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
    public ListNode deleteDuplicates(ListNode head) {
        TreeSet<Integer> set = new TreeSet<>();
        ListNode current = head;

while (current != null) {
    set.add(current.val);
    current = current.next;
}
ListNode dummy = new ListNode(0);
ListNode tail = dummy;

for (int value : set) {
    tail.next = new ListNode(value);
    tail = tail.next;
}

return dummy.next;
    }
}