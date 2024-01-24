
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 

public class p1026_leetcode {
    public int maxAncestorDiff(TreeNode root) {
        return findmaxdiff(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    public static int findmaxdiff(TreeNode root, int min_v, int max_v) {
        if (root == null) {
            return Math.abs(min_v - max_v);
        }
        min_v = Math.min(min_v, root.val);
        max_v = Math.max(max_v, root.val);
        int l = findmaxdiff(root.left, min_v, max_v);
        int r = findmaxdiff(root.right, min_v, max_v);
        return Math.max(l, r);
    }

    public static void main(String[] args) {

    }
}
