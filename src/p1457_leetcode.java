import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class p1457_leetcode {
    public int pseudoPalindromicPaths(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        solve(root, new ArrayList<>(), result);

        // You may want to perform some logic here with the 'result' list
        // For now, just returning 0 as in your original code
        return 0;
    }

    public static int solve(TreeNode root, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> result) {
        if(root == null){
            return 0;
        }
        if (root.left == null && root.right == null) {
            result.add(new ArrayList<>(temp));
            System.out.println(temp);
            return 0;
        } 
            temp.add(root.val);
            if (root.left != null) {
                solve(root.left, temp, result);
            } else if (root.right != null) {
                solve(root.right, temp, result);
            }
        temp.remove(temp.size() - 1);

        return 0;
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(1);

        // Create an instance of the p1457_leetcode class
        p1457_leetcode solution = new p1457_leetcode();

        // Call the pseudoPalindromicPaths method and print the result
        int result = solution.pseudoPalindromicPaths(root);
        System.out.println("Result: " + result);
    }
}
