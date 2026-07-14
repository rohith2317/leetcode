// Last updated: 14/07/2026, 11:23:36
class Solution {
    public int singleNumber(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            index=index^nums[i];
        }
        
        return index;
    }
}