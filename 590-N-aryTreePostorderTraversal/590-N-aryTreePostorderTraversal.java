// Last updated: 02/09/2026, 13:20:40
1//Java Code
2/*
3// Definition for a Node.
4class Node {
5    public int val;
6    public List<Node> children;
7
8    public Node() {}
9
10    public Node(int _val) {
11        val = _val;
12    }
13
14    public Node(int _val, List<Node> _children) {
15        val = _val;
16        children = _children;
17    }
18};
19*/
20
21class Solution {
22    List<Integer> res = new ArrayList<>();
23
24    private void postOrder(Node root) {
25        if (root == null)
26            return;
27        for (Node child : root.children) {
28            postOrder(child);
29            res.add(child.val);
30        }
31    }
32    public List<Integer> postorder(Node root) {
33        if (root == null)
34            return new ArrayList<>();
35        postOrder(root);
36        res.add(root.val);
37        return res;
38    }
39}