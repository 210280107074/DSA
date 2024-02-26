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
class p100_leetcode {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return fn(p,q);
    }
    public Boolean fn(TreeNode p,TreeNode q){
        if(p== null && q == null ){
            return true;
        }
         if (p == null || q == null || p.val != q.val) {
            return false;
        }
        Boolean left = fn(p.left,q.left);
        Boolean right = fn(p.right,q.right);
        return left & right;
    }
}