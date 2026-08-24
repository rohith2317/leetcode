// Last updated: 24/08/2026, 09:12:36
1class Solution {
2    public int climbStairs(int n) {
3
4        int one = 1;
5        int two = 1;
6
7        for (int i = 2; i <= n; i++) {
8            int current = one + two;
9
10            two = one;
11            one = current;
12        }
13
14        return one;
15    }
16}