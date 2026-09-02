// Last updated: 02/09/2026, 13:26:36
1class Solution {
2    public int numSubseq(int[] nums, int target) {
3        int res = 0, mod = 1000000007, l = 0, r = nums.length - 1;
4        List<Integer> pre = new ArrayList<>();
5        pre.add(1);
6        for (int i = 1; i <= nums.length; ++i) {
7            pre.add((pre.get(i - 1) << 1) % mod);
8        }
9
10        Arrays.sort(nums);
11
12        while (l <= r) {
13            if (nums[l] + nums[r] > target) {
14                r--;
15            } else {
16                res = (res + pre.get(r - l++)) % mod;
17            }
18        }
19
20        return res;
21    }
22}