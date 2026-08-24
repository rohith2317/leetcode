// Last updated: 24/08/2026, 09:27:47
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> result = new ArrayList<>();
4        for (int i = 0; i < numRows; i++) {
5            List<Integer> row = new ArrayList<>();
6            for (int j = 0; j <= i; j++) {
7                if (j == 0 || j == i) {
8                    row.add(1);
9                } else {
10                    List<Integer> oldRow = result.get(i - 1);
11                    row.add(oldRow.get(j - 1) + oldRow.get(j));
12                }
13            }
14            result.add(row);
15        }
16        return result;
17    }
18}