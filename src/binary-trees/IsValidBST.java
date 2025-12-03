// Leetcode problem # 98: Validate Binary Search Tree - DFS / recursive solution
// Time complexity: O(n) - we visit each node once
// Space complexity: O(h) - h is the height of the tree, due to recursion
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

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean valid(TreeNode node, long left, long right) {
        if (node == null) {
            return true;
        }
        if (!(left < node.val && node.val < right)) {
            return false;
        }
        return valid(node.left, left, node.val) &&
                valid(node.right, node.val, right);
    }
}
