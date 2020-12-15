package Q094;
/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

import java.util.*;
import Tree.TreeNode;

class leetCode094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Deque<TreeNode> list = new LinkedList<TreeNode>();

        while (root != null || !list.isEmpty()) {
            while (root != null) {
                list.push(root);
                root = root.left;
            }
            root = list.pop();
            result.add(root.val);
            root = root.right;
        }
        return result;
    }
}
// @lc code=end

