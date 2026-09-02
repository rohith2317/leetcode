// Last updated: 02/09/2026, 12:33:45
1class Solution {
2    private List<Integer> res = new ArrayList<>();
3    public List<Integer> inorderTraversal(TreeNode root) {
4        traverse(root);
5        return res;
6    }
7    
8    private void traverse(TreeNode root) {
9        if (root == null) {
10            return;
11        }
12        traverse(root.left);
13        res.add(root.val);
14        traverse(root.right);
15    }
16}