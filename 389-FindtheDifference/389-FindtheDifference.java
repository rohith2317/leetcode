// Last updated: 07/09/2026, 13:44:48
1class Solution {
2    public char findTheDifference(String s, String t) {
3        char[] sChars = s.toCharArray();
4        char[] tChars = t.toCharArray();
5        Arrays.sort(sChars);
6        Arrays.sort(tChars);
7
8        int i = 0;
9        while (i < sChars.length && sChars[i] == tChars[i]) {
10            i++;
11        }
12        return tChars[i];
13    }
14}