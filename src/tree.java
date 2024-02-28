import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

                                                                        
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

class node {
    int data;
    node right;
    node left;

    public node(int data) {
        this.data = data;
    }
                                                        //build tree
    public static node CreateTree() {
        node root = null;
        System.out.println("enter the data : ");
        try (Scanner sc = new Scanner(System.in)) {
            int data = sc.nextInt();
            if (data == -1) {
                return null;
            }

            root = new node(data);
            System.out.println("enter the left of " + data);
            root.left = CreateTree();
            System.out.println("enter the right of " + data);
        }
        root.right = CreateTree();

        return root;

    }
                                                            //inorder traversal 
    public static void InOrder(node root){
       
        if(root ==  null){
            return;
        }
        InOrder(root.left);
        System.out.println(root.data + " ");
        InOrder(root.right);
    }
                                                            //postorder traversal 
    public static void PostOrder(node root){
        
        if(root ==  null){
            return;
        }
        InOrder(root.left);
        InOrder(root.right);
        System.out.println(root.data + " ");
    }
                                                            //preorder traversal 
    public static void PreOrder(node root){
        
        if(root ==  null){
            return;
        }
        System.out.println(root.data + " ");
        InOrder(root.left);
        InOrder(root.right);
    }
                                                            //height of tree
    public int height(node root){
        if(root == null){
            return 0;
        }
        return (Math.max(height(root.left),height(root.right)) + 1);
    }
                                                            //level order traversal
    public static void LevelOrder(node root){
        Queue<node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            node cur = q.poll();
            if(cur == null){
                if(q.isEmpty()){
                    return;
                }
                q.add(null);
                System.out.println();
            }
            else{
                System.out.print(cur.data + " ");
                if(cur.left != null){
                    q.add(cur.left);
                }
                if(cur.right != null){
                    q.add(cur.right);
                }
            }
        }
    }
                                                             // lvl order traversal which return list of nodes at each level 
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        lvlorder(root,list);
        return list;
    }
    public static int findBottomLeftValue(node root) {
        int last = 0;
        Queue<node> q = new LinkedList<>();
        q.offer(root);
         while(!q.isEmpty()){
             int count = q.size();
                 for(int i=0;i<count;i++){
                     node curr = q.poll();
                     if(i==0){
                         last = curr.data;
                     }
                     if(curr.left != null){
                         q.add(curr.left);
                     }
                     if(curr.right != null){
                         q.add(curr.right);
                     }
                 }
         }
         return last; 
     }
    public static void lvlorder(TreeNode root,List<List<Integer>> list){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<>();
            int level = q.size();
            for(int i=0;i<level;i++){
              TreeNode cur = q.poll();
              temp.add(cur.val);
              if(cur.left != null){
                  q.add(cur.left);
              }  
              if(cur.right != null){
                  q.add(cur.right);
              }

            }
            list.add(temp);
            }
        }
                                                             //left view of tree   
    public static void LeftViewHelper(node root,ArrayList list,int level){
        if(root == null){
            return;
        }
        if(list.get(level) == null){
            list.add(root);
        }
        LeftViewHelper(root.left,list,level+1);
        LeftViewHelper(root.right,list,level+1);
    }
    public static void LeftView(node root){
        ArrayList <node> list = new ArrayList<>();
        LeftViewHelper(root,list,0);
        for(node cur : list){
            System.out.println(cur.data + "  ");
        }
    }
                                                            //right view of tree  
    public static void rightViewHelper(node root,ArrayList list,int level){
        if(root == null){
            return;
        }
        if(list.size() == level){
            list.add(root);
        }
        rightViewHelper(root.right,list,level+1);
        rightViewHelper(root.left,list,level+1);
    }
    public static void rightView(node root){
        ArrayList <node> list = new ArrayList<>();
        rightViewHelper(root,list,0);
        for(node cur : list){
            System.out.println(cur.data + "  ");
        }
    }
}

public class tree {
    public static void main(String[] args) {
        node root = node.CreateTree();
        // root.InOrder(root);
        // root.LevelOrder(root);
        System.out.println();
        System.out.println();
        root.LeftView(root);
        // root.rightView(root);
    }
}