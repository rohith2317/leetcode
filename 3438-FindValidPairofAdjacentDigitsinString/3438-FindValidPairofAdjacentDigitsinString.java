// Last updated: 02/09/2026, 14:07:40
1class Solution {
2    public String findValidPair(String s) {
3
4        int len = s.length();
5        int[] count = new int[10];
6
7        for (int i = 0; i < len; i++) {
8            count[s.charAt(i) - '0']++;
9        }
10
11        for (int i = 1; i < len; i++) {
12
13            int num0 = s.charAt(i - 1) - '0';
14            int num1 = s.charAt(i) - '0';
15
16            if (num0 != num1 && num0 == count[num0] && num1 == count[num1]) {
17                return s.substring(i - 1, i + 1);
18            }
19
20        }
21
22        return "";
23    }
24}