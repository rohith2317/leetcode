// Last updated: 14/07/2026, 11:22:28
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ans = new ArrayList<>();
        int[] c1 = new int[101];
        int[] c2 = new int[101];
        int[] c3 = new int[101];
        for(int i = 0 ; i < nums1.length ; i++){
            c1[nums1[i]]++;
        }
        for(int i = 0 ; i < nums2.length ; i++){
            c2[nums2[i]]++;
        }
        for(int i = 0 ; i < nums3.length ; i++){
            c3[nums3[i]]++;
        }

        for(int i = 0 ; i < 101 ; i++){
            if(c1[i]!=0 && c2[i]!= 0 )ans.add(i);
            else if(c1[i]!=0 && c3[i]!= 0 )ans.add(i);
            else if(c2[i]!=0 && c3[i]!= 0 )ans.add(i);
        }

        return ans;
    }
}