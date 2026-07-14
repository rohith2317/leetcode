// Last updated: 14/07/2026, 11:22:39
class Solution {
    public String defangIPaddr(String address) {
        String result = address.replace(".","[.]");
        return(result);
    }
}
