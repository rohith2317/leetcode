// Last updated: 14/07/2026, 11:23:24
class Solution {
    public int reverseBits(int n) {
        int rev = 0;
        for(int i = 0; i < 32; i++) {
            rev = (rev << 1) | ((n >> i) & 1);
        }
        return rev;
    }
}