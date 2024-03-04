import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class tree {
    // Build tree
    public static TreeNode createTree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }

        TreeNode root = new TreeNode(data);
        System.out.println("Enter the left of " + data);
        root.left = createTree();
        System.out.println("Enter the right of " + data);
        root.right = createTree();

        return root;
    }

    // Inorder traversal 
    public static void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // Postorder traversal 
    public static void postorder(TreeNode root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    // Preorder traversal 
    public static void preorder(TreeNode root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public boolean isEvenOddTree(TreeNode root) {
        if (root == null)
       return false;

   Queue<TreeNode> queue = new LinkedList<>();
   queue.add(root);
   int level = 0;
   while(!queue.isEmpty()){
       int size = queue.size();
       int count = 0;
      
       for(int i=0;i<size;i++){
           TreeNode curr = queue.poll();
           if(curr.left != null){
               queue.offer(curr.left);
               count++;
           }
           if(curr.right != null){
               queue.offer(curr.right);
               count++;
           }
       }
       if(level%2 == 0){
           if(count%2 == 0){
               return false;
           }
       }
       if(level%2 != 0){
           if(count%2 != 0){
               return false;
           }
       }
       System.out.print(count);
       level++;
   }
   return true;  
   }

    // Height of tree
    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return (Math.max(height(root.left), height(root.right)) + 1);
    }

    // Level order traversal
    public static void levelOrder(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            if (cur == null) {
                if (q.isEmpty()) {
                    return;
                }
                q.add(null);
                System.out.println();
            } else {
                System.out.print(cur.val + " ");
                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);
                }
            }
        }
    }

    // Left view of tree
    public static void leftView(TreeNode root) {
        leftViewHelper(root, new ArrayList<>(), 0);
    }

    private static void leftViewHelper(TreeNode root, List<TreeNode> list, int level) {
        if (root == null) {
            return;
        }
        if (list.size() == level) {
            list.add(root);
            System.out.print(root.val + " ");
        }
        leftViewHelper(root.left, list, level + 1);
        leftViewHelper(root.right, list, level + 1);
    }

    // Right view of tree
    public static void rightView(TreeNode root) {
        rightViewHelper(root, new ArrayList<>(), 0);
    }

    private static void rightViewHelper(TreeNode root, List<TreeNode> list, int level) {
        if (root == null) {
            return;
        }
        if (list.size() == level) {
            list.add(root);
            System.out.print(root.val + " ");
        }
        rightViewHelper(root.right, list, level + 1);
        rightViewHelper(root.left, list, level + 1);
    }

    public static void main(String[] args) {
        TreeNode root = createTree();
        System.out.println("Inorder Traversal:");
        inorder(root);
        System.out.println("\nPostorder Traversal:");
        postorder(root);
        System.out.println("\nPreorder Traversal:");
        preorder(root);
        System.out.println("\nHeight of the tree: " + height(root));
        System.out.println("Level Order Traversal:");
        levelOrder(root);
        System.out.println("\nLeft View of the tree:");
        leftView(root);
        System.out.println("\nRight View of the tree:");
        rightView(root);
    }
}
