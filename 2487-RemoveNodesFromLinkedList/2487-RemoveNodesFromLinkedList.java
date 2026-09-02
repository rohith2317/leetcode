// Last updated: 02/09/2026, 13:16:15
1class Solution {
2    public ListNode removeNodes(ListNode head) {
3        if (head == null) return null;
4
5        head.next = removeNodes(head.next);
6        
7        if (head.next != null && head.val < head.next.val) {
8            return head.next;  
9        }
10        
11        return head;  
12    }
13}