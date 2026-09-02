// Last updated: 02/09/2026, 13:11:24
1class Solution {
2    public int maxDifference(String s) {
3        int[] freq = new int[26];
4        for (int i = 0; i < s.length(); i++) freq[s.charAt(i) - 'a']++;
5        int maxOdd = -1;
6        int minEven = Integer.MAX_VALUE;
7        for (int f : freq) {
8            if (f == 0) continue;
9            if ((f & 1) == 1) maxOdd = Math.max(maxOdd, f);
10            else minEven = Math.min(minEven, f);
11        }
12        if (maxOdd == -1 || minEven == Integer.MAX_VALUE) return -1;
13        return maxOdd - minEven;
14    }
15}