// Last updated: 14/07/2026, 11:23:11
class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
        while (n % factor == 0) {
        n /= factor;
      }
    }
        return n == 1;
    }
}