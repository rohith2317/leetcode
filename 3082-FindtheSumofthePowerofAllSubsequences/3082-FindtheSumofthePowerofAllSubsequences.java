// Last updated: 02/09/2026, 13:25:34
1class Solution {
2    static int dp[][][];
3    static int mod = (int) (1e9) + 7;
4
5    static int helper(int arr[], int idx, int currSum, int k, int size){
6        if(currSum==k){
7            return (int)(Math.pow(2,arr.length-size)%mod);
8        }
9        if(idx>=arr.length || currSum>k) return 0;
10        if(dp[idx][currSum][size]!=-1) return dp[idx][currSum][size];
11
12        int ans = (helper(arr,idx+1,currSum,k,size)%mod+helper(arr,idx+1,currSum+arr[idx],k,size+1))%mod;
13        return dp[idx][currSum][size] = ans;
14    }
15    public int sumOfPower(int[] arr, int k) {
16        dp = new int[105][105][105];
17        for(var a : dp) for(var b : a) Arrays.fill(b,-1);
18        return helper(arr,0,0,k,0);
19    }
20}