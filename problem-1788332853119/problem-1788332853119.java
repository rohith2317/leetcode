// Last updated: 02/09/2026, 12:37:33
1class Solution 
2{
3  public int minDiffInBST(TreeNode root) 
4  {
5    inorder(root);
6    return ans;
7  }
8
9  private int ans = Integer.MAX_VALUE;
10  private Integer pred = null;
11
12  private void inorder(TreeNode root) 
13  {
14    if (root == null)
15      return;
16
17    inorder(root.left);
18    if (pred != null)
19      ans = Math.min(ans, root.val - pred);
20    pred = root.val;
21    inorder(root.right);
22  }
23}