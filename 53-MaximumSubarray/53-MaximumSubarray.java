// Last updated: 14/07/2026, 11:23:48
class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int total = 0;
        for (int n : nums) {
        if (total < 1) {
        total = 0;
    }
        total += n;
        res = Math.max(res, total);
        }
        return res;        
    }
}