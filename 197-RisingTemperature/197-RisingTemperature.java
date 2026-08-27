// Last updated: 27/08/2026, 09:48:30
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if(s.length() != goal.length()) return false;
4        s = s + s;
5        if(s.contains(goal)) return true;
6        return false;
7    }
8}