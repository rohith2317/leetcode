// Last updated: 28/08/2026, 10:51:52
1class Solution {
2    public int fourSumCount(int[] arr1, int[] arr2, int[] arr3, int[] arr4) {
3        int n = arr1.length;
4        Map<Integer, Integer> map = new HashMap<>();
5        int count = 0;
6
7        for(int i=0; i<n; i++){
8            for(int j=0; j<n; j++){
9                map.put(arr3[i] + arr4[j], map.getOrDefault(arr3[i] + arr4[j], 0)+1);
10            }
11        }
12
13        for(int i=0; i<n; i++){
14            for(int j=0; j<n; j++){
15                count += map.getOrDefault(- (arr1[i] + arr2[j]), 0);
16            }
17        }
18        return count;
19}
20}