// Last updated: 02/09/2026, 12:12:05
1class Solution {
2    public int numMatchingSubseq(String s, String[] words) {
3        int match = 0;
4        int n = s.length();
5        HashMap<String, Integer> freqWords = new HashMap<>();
6        for(String word : words){
7            freqWords.put(word, freqWords.getOrDefault(word, 0) + 1);
8        }
9        for(String subsequence : freqWords.keySet()){
10            int i=0, j=0, m=subsequence.length();
11            while(i<n && j<m){
12                if(s.charAt(i) == subsequence.charAt(j)){
13                    j++;
14                }
15                i++;
16            }
17            if(j==m){
18                match += freqWords.get(subsequence);
19            }
20        }
21        return match;
22    }
23}