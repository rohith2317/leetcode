// Last updated: 02/09/2026, 11:53:14
1class Solution {
2    public boolean isPalindrome(ListNode head) {
3        List<Integer> list = new ArrayList();
4        while(head != null) {
5            list.add(head.val);
6            head = head.next;
7        }   
8        int left = 0;
9        int right = list.size()-1;
10        while(left < right && list.get(left) == list.get(right)) {
11            left++;
12            right--;
13        }
14        return right <= left;
15    }
16}