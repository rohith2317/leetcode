// Last updated: 07/09/2026, 14:34:53
1class Solution {
2    public int mostFrequent(int[] nums, int key) {
3
4        int[] count = new int[1001];
5
6        for (int i = 0; i < nums.length - 1; i++) {
7
8            if (nums[i] == key) {
9                count[nums[i + 1]]++;
10            }
11        }
12
13        int answer = 0;
14        int max = 0;
15
16        for (int i = 0; i < count.length; i++) {
17
18            if (count[i] > max) {
19                max = count[i];
20                answer = i;
21            }
22        }
23
24        return answer;
25    }
26}