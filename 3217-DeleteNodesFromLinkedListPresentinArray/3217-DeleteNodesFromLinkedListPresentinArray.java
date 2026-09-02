// Last updated: 02/09/2026, 14:23:36
1class Solution {
2    public ListNode modifiedList(int[] nums, ListNode head) {
3        int max = -1;
4        for (int num : nums) max = Math.max(max, num);
5        boolean[] freq = new boolean[max + 1];  
6        
7        for (int num : nums) freq[num] = true;
8
9        ListNode temp = new ListNode();
10        ListNode curr = temp;
11
12        while (head != null) {
13            if (head.val >= freq.length || freq[head.val] == false) {
14                curr.next = head;
15                curr = curr.next;
16            }
17
18            head = head.next;
19        }
20
21        curr.next = null;
22        return temp.next;
23    }
24}