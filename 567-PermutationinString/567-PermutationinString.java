// Last updated: 02/09/2026, 12:04:39
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        if(s1.length() > s2.length()) return false;
4        char[] mp = new char[26], temp = new char[26];
5        for(char c : s1.toCharArray()) mp[c - 'a']++;
6        int left = 0, right = 0;
7        for(right = 0; right < s1.length(); right++)
8            temp[s2.charAt(right) - 'a']++;
9        if(Arrays.equals(mp, temp)) return true;
10        while(right < s2.length()) {
11            temp[s2.charAt(right) - 'a']++;
12            temp[s2.charAt(left) - 'a']--;
13            left++;
14            right++;
15            if(Arrays.equals(mp, temp)) return true;
16        }
17        return false;
18    }
19}