// Last updated: 28/08/2026, 10:04:12
1class Solution {
2   public int[] twoSum(int[] nums, int target) {
3	int l = 0, r = nums.length - 1;
4	
5	while (nums[l] + nums[r] != target) {
6		if (nums[l] + nums[r] < target) l++;
7		else r--;
8	}
9
10	return new int[] {l+1, r+1};
11}
12}