import java.util.ArrayList;

class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data = data;
    }
}
public class binary_search_tree {
    public static Node insertNode(Node root,int data){
        if (root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data){
            root.left = insertNode(root.left, data);
        }
        else{
            root.right = insertNode(root.right, data);
        }
        return root;
    }
    public static boolean search(Node root,int data){
        if(root == null){
            return false;
        }
        if(data < root.data){
           return  search(root.left, data);
        }
        else if(root.data == data){
            return true;
        }
        else{
            return search(root.right, data);
        }
    }
    public static Node deleteNode(Node root , int value){
        
        if(root.data > value){
            root.left = deleteNode(root.left, value);
        }
        else if(root.data < value){
            root.right = deleteNode(root.right, value);
        }
        else{
            if(root.right == null && root.left == null){
                return null;
            }
            else if(root.right == null ){
                return root.left;
            }
            else if(root.left == null){
                return root.right;
            }
            else{
                Node IS = InorderSuccesor(root.right);
                root.data = IS.data;
                root.right = deleteNode(root.right, IS.data);
            }
        }
        return root;
    }
    public static Node InorderSuccesor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void InOrder(Node root){
        if(root == null){
            return ;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }
     public static boolean isValidBST(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);
         boolean flag = true;
        for(int i=0;i<list.size();i++){
            if(i+1<list.size()){
            if(list.get(i)>=list.get(i+1)){
                flag = false;
                break;
            }
            }
            if(i==(list.size()-1)){
               flag = true;
            }
        }
        return flag;
    }
    public static ArrayList inorder(Node root,ArrayList<Integer> list){
        if(root == null){
            return list;
        }
            inorder(root.left,list);
            list.add(root.data);
            inorder(root.right,list);
            return list;
    }
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int l = diameter(root.left); 
        int r = diameter(root.right);
        int res = height(root.left) + height(root.right)+1;
        return  Math.max(res,Math.max(l,r));
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void main(String[] args) {
        int data[]  = {5,3,30,56,4,58,66,99,77,88};
        Node root = null;
        for(int i=0;i<data.length;i++){
            root = insertNode(root,data[i]);
        }
        System.out.println(diameter(root));
        // InOrder(root);
        // // System.out.println(search(root, 3));
        // deleteNode(root, 58);
        // System.out.println();
        // InOrder(root);
        // System.out.println(isValidBST(root));

    }
}
