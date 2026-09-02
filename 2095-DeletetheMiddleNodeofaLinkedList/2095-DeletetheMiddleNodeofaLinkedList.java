// Last updated: 02/09/2026, 12:41:03
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteMiddle(ListNode head) {
13        if(head == null || head.next == null) return null;
14        ListNode slow = head, fast = head.next.next;
15        while(fast != null && fast.next != null){
16            slow = slow.next;
17            fast = fast.next.next;
18        }
19        slow.next = slow.next.next;
20        return head;
21    }
22}