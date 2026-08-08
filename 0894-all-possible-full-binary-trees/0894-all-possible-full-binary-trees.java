class Solution {

    public List<TreeNode> build(int n) {

        List<TreeNode> ans = new ArrayList<>();

        // Even number of nodes cannot form a Full Binary Tree
        if (n % 2 == 0)
            return ans;

        // Base case
        if (n == 1) {
            ans.add(new TreeNode(0));
            return ans;
        }

        // Try every possible odd split
        for (int leftNodes = 1; leftNodes < n; leftNodes += 2) {

            int rightNodes = n - 1 - leftNodes;

            List<TreeNode> leftTrees = build(leftNodes);
            List<TreeNode> rightTrees = build(rightNodes);

            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {

                    TreeNode root = new TreeNode(0);

                    root.left = left;
                    root.right = right;

                    ans.add(root);
                }
            }
        }

        return ans;
    }

    public List<TreeNode> allPossibleFBT(int n) {
        return build(n);
    }
}