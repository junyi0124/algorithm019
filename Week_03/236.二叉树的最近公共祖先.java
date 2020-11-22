/*
 * @lc app=leetcode.cn id=236 lang=java
 *
 * [236] 二叉树的最近公共祖先
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    TreeNode ans = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.ans;
    }

    /*
     *递归
     */
    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) 
            return false;
        // 探测左子树
        boolean lson = dfs(root.left,  p, q);
        // 探测右子树
        boolean rson = dfs(root.right, p, q);
        // check
        if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
            ans = root;
        }
        
        return lson || rson || (root.val == p.val || root.val == q.val);
    }
}
// @lc code=end

