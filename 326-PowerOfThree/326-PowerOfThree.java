// Last updated: 14/07/2026, 11:23:03
class Solution {
    public boolean isPowerOfThree(int n) {
       if(n<1)return false;
       while(n!=1){
        if(n%3!=0) return false;
        n=n/3;
    }
    return true;
    }
}