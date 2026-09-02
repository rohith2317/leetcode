// Last updated: 02/09/2026, 13:19:21
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        HashMap<Integer,Integer>map=new LinkedHashMap<>();
4        Stack<Integer>st=new Stack<>();
5        int n=nums2.length;
6        for(int i=n-1;i>=0;i--){
7            while(!st.isEmpty()&&st.peek()<nums2[i]){
8                st.pop();
9            }
10            if(st.isEmpty())map.put(nums2[i],-1);
11            else map.put(nums2[i],st.peek());
12            st.push(nums2[i]);
13        }
14        int []res=new int[nums1.length];
15        for(int i=0;i<nums1.length;i++){
16            res[i]=map.get(nums1[i]);
17        }
18        return res;
19    }
20}