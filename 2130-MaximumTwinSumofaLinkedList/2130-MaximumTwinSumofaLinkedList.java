// Last updated: 02/09/2026, 12:10:22
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
12    public int pairSum(ListNode head) {
13        ListNode slow = head;
14        ListNode fast = head;
15        while(fast!=null && fast.next!=null){
16            slow = slow.next;
17            fast = fast.next.next;
18        }
19        ListNode curr = slow;
20        ListNode prev = null;
21        while(curr!=null){
22            ListNode temp = curr.next;
23            curr.next = prev;
24            prev = curr;
25            curr = temp;
26
27        }
28        ListNode left = head;
29        ListNode right = prev;
30        int max = 0;
31        while(left!=null && right!=null){
32            int sum = left.val + right.val;
33            max = Math.max(max, sum);
34            left = left.next;
35            right = right.next; 
36        }
37        return max;
38    }
39}