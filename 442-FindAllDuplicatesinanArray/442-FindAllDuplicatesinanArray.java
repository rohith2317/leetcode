// Last updated: 28/08/2026, 10:24:59
1class Solution {
2    public List<Integer> findDuplicates(int[] nums){
3        List<Integer> ans = new ArrayList<>();
4        HashSet<Integer> set = new HashSet<>();
5
6        for(int num : nums){
7            if(set.contains(num)){
8                ans.add(num);
9            }
10            set.add(num);
11        }
12        return ans;
13    }
14}