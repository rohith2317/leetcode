// Last updated: 02/09/2026, 12:22:43
1class Solution {
2       public long zeroFilledSubarray(int[] nums) {
3        long cnt = 0, zeroSubarraysEndingAtCurrentIndex = 0;
4        for (int n : nums) {
5            if (n == 0) {
6                cnt += ++zeroSubarraysEndingAtCurrentIndex;
7            }else {
8                zeroSubarraysEndingAtCurrentIndex = 0;
9            }
10        }
11        return cnt;
12    }
13
14}