// Last updated: 31/08/2026, 15:08:03
1class Solution {
2    public int countArrays(int[] o, int[][] b) {
3
4        int ans = Integer.MAX_VALUE;
5
6        int n = o.length;
7        int min = b[0][0];
8        int max = b[0][1];
9
10        for (int i = 1; i < n; i++) {
11            int diff = o[i] - o[i - 1];
12            min+= diff;
13            max+= diff;
14            
15            if (b[i][0] > min)
16                min = b[i][0];
17            if (b[i][1] < max)
18                max = b[i][1];
19
20            ans = Math.min(ans, max - min + 1);
21
22        }
23
24        return Math.max(0, ans);
25    }
26}