// Last updated: 14/07/2026, 11:22:29
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String pattern : patterns) {
            if(word.contains(pattern)) {
                count++;
            }
        }
        return count;
    }
}