// Last updated: 07/09/2026, 14:35:20
1class Solution {
2    public int mostFrequent(int[] nums, int key) {
3
4        int[] count = new int[1001];
5
6        for (int i = 0; i < nums.length - 1; i++) {
7            if (nums[i] == key) {
8                count[nums[i + 1]]++;
9            }
10        }
11        int answer = 0;
12        int max = 0;
13        for (int i = 0; i < count.length; i++) {
14            if (count[i] > max) {
15                max = count[i];
16                answer = i;
17            }
18        }
19
20        return answer;
21    }
22}