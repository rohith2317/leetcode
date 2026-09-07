// Last updated: 07/09/2026, 14:07:19
1class Solution {
2    public int findPermutationDifference(String s, String t) {
3        int sum = 0;
4        for (int i = 0; i < s.length(); i++) {
5           sum += Math.abs(i - t.indexOf(s.charAt(i)));
6        }
7        return sum;
8    }
9}