// Last updated: 07/09/2026, 14:31:46
1class Solution {
2    public int mostFrequent(int[] nums, int key) {
3        Map<Integer, Integer> map = new HashMap<>();
4        int maxCount = 0;
5        int result = 0;
6
7        for (int i = 0; i < nums.length - 1; i++) {
8            if (nums[i] == key) {
9                int next = nums[i + 1];
10                map.put(next, map.getOrDefault(next, 0) + 1);
11
12                if (map.get(next) > maxCount) {
13                    maxCount = map.get(next);
14                    result = next;
15                }
16            }
17        }
18
19        return result;
20    }
21}