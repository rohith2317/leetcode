// Last updated: 14/07/2026, 11:24:08
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int org = x;
        int rev =0;
        while(x!=0){
        int digit = x%10;
        rev = rev*10+digit;
        x = x/10;
        }
        return org == rev;
    }
}