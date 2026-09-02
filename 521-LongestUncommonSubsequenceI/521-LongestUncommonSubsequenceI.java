// Last updated: 02/09/2026, 13:58:15
1class Solution {
2    public int findLUSlength(String a, String b) {
3        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
4    }
5}