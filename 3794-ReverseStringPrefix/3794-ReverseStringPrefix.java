// Last updated: 02/09/2026, 12:44:34
1class Solution {
2    public String reversePrefix(String s, int k) {
3        char[] arr = s.toCharArray();   
4        for (int i = 0; i < k / 2; i++) {
5            char temp = arr[i];
6            arr[i] = arr[k - 1 - i];
7            arr[k - 1 - i] = temp;
8        } 
9        return new String(arr);
10    }
11}