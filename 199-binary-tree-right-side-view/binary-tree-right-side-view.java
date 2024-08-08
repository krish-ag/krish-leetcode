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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        rightView(root, 1, ans);
        return ans;
    }
    int max = 0;
    public void rightView(TreeNode root, int lvl, List<Integer> ans){
        if (root == null) return;
        if (lvl > this.max) {
            ans.add(root.val);
            this.max = lvl;
        }

        rightView(root.right, lvl + 1, ans);
        rightView(root.left, lvl + 1, ans);

    }

}
