// Last updated: 28/08/2026, 10:00:58
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        int result = nums[0] + nums[1] + nums[2];
6
7        for(int i = 0 ;i<n-2 ;i++)
8        {
9            int left = i+1 , right = n-1;
10
11            while(left<right)
12            {
13                int sum = nums[i] + nums[left] + nums[right];
14                if(Math.abs(target-sum) < Math.abs(target - result))
15                {
16                    result = sum;
17                }
18
19                if(sum == target) return target;
20                else if(sum<target) left++;
21                else right--;
22            }
23        }
24        return result;
25    }
26}