// Last updated: 02/09/2026, 13:12:46
1class Solution {
2    public void deleteNode(ListNode node) {
3        if (node == null || node.next == null) return; 
4        node.val = node.next.val; 
5        node.next = node.next.next; 
6    }
7}