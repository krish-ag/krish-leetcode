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
class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;
        TreeNode flatten = new TreeNode();
        flatten.val = root.val;
        flatten.left = root.left;
        flatten.right = root.right;
        root.left = null;
        root.right = null;
        flattenTree(flatten, root);
    }

    public static void flattenTree(TreeNode node, TreeNode flat) {
        flat.val = node.val;
        if(node.left != null) {
            flat.right = new TreeNode();
            flattenTree(node.left, flat.right);
        }
        if (node.right != null) {
            while (flat.right != null) flat = flat.right;
            flat.right = new TreeNode();
            flattenTree(node.right, flat.right);
        }
    }
}

