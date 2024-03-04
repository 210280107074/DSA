import java.util.LinkedList;
import java.util.Queue;

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
class p1609_leetcode {
    public boolean isEvenOddTree(TreeNode root) {
         if (root == null || root.val%2 == 0)
        return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean level = true;
        while(!q.isEmpty()){
            int size = q.size();
            int prev;
            if(level == true){
                prev = Integer.MIN_VALUE;
            }
            else{
                prev = Integer.MAX_VALUE;
            }
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                if(level == true && ((curr.val%2 == 0) && curr.val <= prev )){
                    return false;
                }
                if(level == false && ((curr.val%2 != 0) && curr.val >= prev )){
                    return false;
                }
                prev = curr.val;
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
            }
            level = !level;
        }
        return true;
    }
}
   
  


