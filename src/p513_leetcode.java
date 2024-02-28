import java.util.Queue;

public class p513_leetcode {

    public static void main(String[] args) {
        int last = 0;
        int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int count = q.size();
                for(int i=0;i<count;i++){
                    TreeNode curr = q.poll();
                    if(i==0){
                        last = curr.val;
                    }
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
            }
        }
        return last;
}
}
