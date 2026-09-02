// Last updated: 02/09/2026, 12:24:35
1class Solution {
2    public int maxOperations(int[] nums, int k) {
3        int ops=0;
4        int i=0; 
5        int j= nums.length-1;
6        Arrays.sort(nums);
7        while(i<j){
8            if(nums[i]+nums[j]==k){
9                ops++;
10                i++; j--;
11            } else if(nums[i]+nums[j]>k){
12                j--;
13            } else{
14                i++;
15            }
16        }
17        return ops;
18    }
19}