// Last updated: 24/08/2026, 09:37:56
1
2class Solution {
3   public boolean isSameTree(TreeNode p, TreeNode q) {
4    if (p == null && q == null) return true;
5    if (p == null || q == null) return false;
6    if (p.val != q.val) return false;
7    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
8  }
9}