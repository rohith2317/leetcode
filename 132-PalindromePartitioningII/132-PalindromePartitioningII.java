// Last updated: 01/09/2026, 10:59:23
1class Solution {
2    public int minCut(String s) {
3        int n = s.length();
4        boolean[][] palindrome = new boolean[n][n];
5        for (int i = n - 1; i >= 0; i--) {
6            for (int j = i; j < n; j++) {
7                if (s.charAt(i) == s.charAt(j) &&
8                    (j - i <= 1 || palindrome[i + 1][j - 1])) {
9                    palindrome[i][j] = true;
10                }
11            }
12        }
13        int[] dp = new int[n];
14
15        for (int i = 0; i < n; i++) {
16            dp[i] = i; 
17             for (int j = 0; j <= i; j++) {
18                if (palindrome[j][i]) {
19
20                    if (j == 0) {
21                        dp[i] = 0;
22                    } else {
23                        dp[i] = Math.min(dp[i], dp[j - 1] + 1);
24                    }
25                }
26            }
27        }
28
29        return dp[n - 1];
30    }
31}