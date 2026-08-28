// Last updated: 28/08/2026, 10:20:21
1class Solution {
2    public int combinationSum4(int[] N, int T) {
3        int[] dp = new int[T+1];
4        dp[0] = 1;
5        for (int i = 1; i <= T; i++)
6            for (int num : N)
7                if (num <= i) dp[i] += dp[i-num];
8        return dp[T];
9    }
10}