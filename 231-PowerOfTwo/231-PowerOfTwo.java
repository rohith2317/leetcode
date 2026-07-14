// Last updated: 14/07/2026, 11:23:14
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        
        while (n > 0) {
            if (n == 1) return true;
            if (n % 2 != 0) break;
            n /= 2;
        }
        return false;
    }
}