// Last updated: 02/09/2026, 13:57:38
1class Solution {
2    public int findLUSlength(String[] strs) {
3        int max=-1;
4        for(int i=0;i<strs.length;i++){
5            boolean flag=false;
6            int cur=strs[i].length();
7            for(int j=0;j<strs.length;j++){
8                if(i!=j && isSubsequence(strs[i], strs[j])){
9                    flag=true;
10                    break;
11                }
12            }
13            if(!flag){
14                max=Math.max(max,cur);
15            }
16        }
17        return max;
18    }
19    private boolean isSubsequence(String a, String b){
20        if(a.equals(b)) return true;
21        int i=0;
22        int j =0;
23        while(i<a.length() && j<b.length()){
24            if(a.charAt(i) == b.charAt(j++)){
25                i++;
26            }
27        }
28        return i==a.length();
29    }
30}