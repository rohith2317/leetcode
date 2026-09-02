// Last updated: 02/09/2026, 14:21:58
1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3        ListNode dummy = new ListNode(0); 
4        dummy.next = head;
5        ListNode prev = dummy; 
6        for(int i = 0; i < left - 1; i++)
7            prev = prev.next; 
8        ListNode curr = prev.next;
9        for(int i = 0; i < right - left; i++){
10            ListNode forw = curr.next; 
11            curr.next = forw.next;
12            forw.next = prev.next;
13            prev.next = forw;
14        }
15        return dummy.next;
16    }
17}