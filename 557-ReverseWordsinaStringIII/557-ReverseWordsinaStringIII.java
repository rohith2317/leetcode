// Last updated: 02/09/2026, 12:14:55
1class Solution {
2    public String reverseWords(String s) {
3        String[] words =s.split(" ");
4        for(int i=0;i<words.length;i++){
5            words[i] = new StringBuilder (words[i]).reverse().toString();
6        }
7        return String.join(" ", words);
8    }
9}
10