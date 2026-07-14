// Last updated: 14/07/2026, 11:22:31
class Solution {
    public int sumBase(int n, int k) {
        int sum =0;
        while( n>0){
            int digit = n%k;
            sum +=digit;
            n = n/k;
        }
        return sum;
    }
}