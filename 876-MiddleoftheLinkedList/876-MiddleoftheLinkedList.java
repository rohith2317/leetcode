// Last updated: 02/09/2026, 12:42:49
1class Solution {
2    public ListNode middleNode(ListNode head) {
3        ListNode slow = head, fast = head;
4        while (fast != null && fast.next != null) {
5            slow = slow.next;
6            fast = fast.next.next;
7        }
8        return slow;
9    }
10}