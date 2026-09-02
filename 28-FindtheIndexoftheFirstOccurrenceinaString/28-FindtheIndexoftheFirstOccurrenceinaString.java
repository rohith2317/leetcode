// Last updated: 02/09/2026, 13:35:20
1class Solution {
2    public List<String> fizzBuzz(int n) {
3        List<String> ans = new ArrayList<>();
4        for (int i = 1; i <= n; i++) {
5            if (i % 15 == 0) {
6                ans.add("FizzBuzz");
7            } else if (i % 3 == 0) {
8                ans.add("Fizz");
9            } else if (i % 5 == 0) {
10                ans.add("Buzz");
11            } else {
12                ans.add(String.valueOf(i));
13            }
14        }
15                         
16        return ans;                 
17    }
18}
19