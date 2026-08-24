// Last updated: 24/08/2026, 09:24:40
1class Solution {
2    public List<TreeNode> generateTrees(int n) {
3        return solve(1, n);
4    }
5
6    public List<TreeNode> solve(int start, int end) {
7        List<TreeNode> bstList = new ArrayList<>();
8
9        if (start > end) {
10            bstList.add(null);
11            return bstList;
12        }
13
14        for (int i = start; i <= end; i++) {
15            List<TreeNode> leftBst = solve(start, i - 1);
16            List<TreeNode> rightBst = solve(i + 1, end);
17
18            for (TreeNode left : leftBst) {
19                for (TreeNode right : rightBst) {
20                    TreeNode root = new TreeNode(i);
21                    root.left = left;
22                    root.right = right;
23                    bstList.add(root);
24                }
25            }
26        }
27
28        return bstList;
29    }
30}