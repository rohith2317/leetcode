// Last updated: 27/08/2026, 09:13:19
1class Solution {
2    public String reverseVowels(String s) {
3        char[] word = s.toCharArray();
4        int start = 0;
5        int end = s.length() - 1;
6        String vowels = "aeiouAEIOU";
7        while (start < end) {
8            while (start < end && vowels.indexOf(word[start]) == -1) {
9                start++;
10            }
11            while (start < end && vowels.indexOf(word[end]) == -1) {
12                end--;
13            }
14            char temp = word[start];
15            word[start] = word[end];
16            word[end] = temp;
17            
18            start++;
19            end--;
20        }
21        String answer = new String(word);
22        return answer;
23    }
24}