// Last updated: 14/07/2026, 11:23:34
class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;
        for (final int num : nums) {
            ones ^= (num & ~twos);
            twos ^= (num & ~ones);
        }
        return ones;
    }
}