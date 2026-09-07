// Last updated: 07/09/2026, 14:41:35
1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int left =0, right =0;
4        for(int num : nums){
5            left = Math.max(left, num); 
6            right += num; 
7        }
8        while(left<=right){
9            int mid = left + (right - left)/2;
10            int parts = 1;
11            int currentSum = 0;
12
13            for(int num : nums){
14                if(currentSum + num > mid){
15                    parts++;
16                    currentSum = num;
17                }else{
18                    currentSum += num;
19                }
20            }
21            if(parts<=k) right = mid - 1;
22            else left = mid + 1; 
23               }
24        return left;
25    }
26}