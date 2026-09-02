// Last updated: 02/09/2026, 13:28:58
1class Solution {
2    public boolean search(int[] nums, int target) {
3        for(int i=0;i<nums.length;i++){
4            if(nums[i]==target){
5                return true;
6            }
7        }
8        return false;
9    }
10}