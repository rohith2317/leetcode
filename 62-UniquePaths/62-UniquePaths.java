// Last updated: 02/09/2026, 11:34:15
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int d = m - 1;
4        int r = n - 1;
5        int k = Math.min(d, r);
6        long result = 1;
7        for (int i = 1; i <= k; i++) {
8            result = result * (d + r - k + i) / i;
9        }
10        return (int) result;
11    }
12}