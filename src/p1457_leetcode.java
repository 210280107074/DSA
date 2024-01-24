import java.util.ArrayList;

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

public class p1457_leetcode {
    public int pseudoPalindromicPaths (TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        solve(root, new ArrayList<>(), result);
         
        return 0;
    }
    public static int  solve(TreeNode root,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> result){
        if(root.left == null && root.right == null){
            result.add(new ArrayList<>(temp));
            System.out.println(temp);
            temp.remove(temp.size() - 1);
            return 0;
        }

        temp.add(root.val);
        
        solve(root.left,temp,result);
        solve(root.right,temp,result);
       
        
        return 0;
    }
    public static int solve(TreeNode root){
        if(root.left == null && root.right == null){
            System.out.println(root.val);
        }
        solve(root.left);
        solve(root.right);
        return 0;
    }
    public static void main(String[] args) {
        
    }
}
