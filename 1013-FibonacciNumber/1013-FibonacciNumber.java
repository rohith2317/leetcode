// Last updated: 14/07/2026, 11:22:43
class Solution {
    public int fib(int n) {
        if(n<=1)
        return n;
    return fib(n-1) + fib(n-2);
    }
}