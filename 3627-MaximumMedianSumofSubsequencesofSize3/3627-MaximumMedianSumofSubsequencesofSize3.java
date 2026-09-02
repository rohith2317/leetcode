// Last updated: 02/09/2026, 13:33:56
1class Solution {
2    public long maximumMedianSum(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        long sum = 0;
6        int k = n / 3; 
7        int index = n - 2;
8        for(int i = 0; i < k; i++){
9            sum += nums[index];
10            index -= 2;
11        }
12        return sum;
13    }
14}