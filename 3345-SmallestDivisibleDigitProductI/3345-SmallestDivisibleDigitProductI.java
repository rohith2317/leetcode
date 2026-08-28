// Last updated: 28/08/2026, 11:04:03
1class Solution {
2    public int smallestNumber(int n, int t) {
3        while (true) {
4            int temp = n;
5            int digitProduct = 1;
6            while (temp > 0) {
7                digitProduct *= (temp % 10);
8                temp /= 10;
9            }
10            if (digitProduct % t == 0) {
11                return n;
12            }
13            n++;
14        }
15    }
16}