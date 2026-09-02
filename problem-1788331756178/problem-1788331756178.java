// Last updated: 02/09/2026, 12:19:16
1class Solution {
2
3    public long func(int[] a, long[] dp, int i) {
4
5        if (i == 0) {
6            return 1;
7        }
8
9        if (dp[i] != 0) {
10            return dp[i];
11        }
12
13        if (a[i] == a[i - 1] - 1) {
14            dp[i] = func(a, dp, i - 1) + 1;
15        } 
16        else {
17            dp[i] = 1;
18        }
19
20        return dp[i];
21    }
22
23    public long getDescentPeriods(int[] a) {
24
25        long[] dp = new long[a.length];
26
27        long ans = 0;
28
29        for (int i = 0; i < a.length; i++) {
30            ans += func(a, dp, i);
31        }
32
33        return ans;
34    }
35}