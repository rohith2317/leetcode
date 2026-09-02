// Last updated: 02/09/2026, 14:15:28
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3        int i = 0, j = 0;
4        while (i < nums1.length && j < nums2.length) {
5            if (nums1[i] == nums2[j])
6                return nums1[i];
7            if (nums1[i] < nums2[j])
8                i++;
9            else
10                j++;
11        }
12        return -1;
13    }
14}