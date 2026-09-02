// Last updated: 02/09/2026, 14:28:07
1import java.util.Arrays;
2
3public class Solution {
4    public int minimumAddedCoins(int[] coins, int target) {
5        Arrays.sort(coins);
6        long maxReach = 0;
7        int addedCoins = 0;
8
9        for (int coin : coins) {
10            while (coin > maxReach + 1) {
11                maxReach += maxReach + 1;
12                addedCoins++;
13            }
14            maxReach += coin;
15        }
16
17        while (maxReach < target) {
18            maxReach += maxReach + 1;
19            addedCoins++;
20        }
21
22        return addedCoins;
23    }
24
25}