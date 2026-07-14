// Last updated: 14/07/2026, 11:23:23
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n>0){
            if(n%2!=0){
                count++;
            }
            n/=2;
        }
        return count;
    }
}