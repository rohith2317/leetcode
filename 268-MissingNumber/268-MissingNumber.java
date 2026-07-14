// Last updated: 14/07/2026, 11:23:09
class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length;
       int esum = n*(n+1)/2;
       int asum = 0;
       for(int num:nums){
        asum += num;
       } 
       return esum - asum;
    }
}