import java.util.ArrayList;

class node{
    int data;
    node right;
    node left;
    node(int data){
        this.data = data;
    }
}
public class binary_search_tree {
    public static node insertNode(node root,int data){
        if (root == null){
            root = new node(data);
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
    public static boolean search(node root,int data){
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
    public static node deleteNode(node root , int value){
        
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
                node IS = InorderSuccesor(root.right);
                root.data = IS.data;
                root.right = deleteNode(root.right, IS.data);
            }
        }
        return root;
    }
    public static node InorderSuccesor(node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void InOrder(node root){
        if(root == null){
            return ;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }
     public static boolean isValidBST(node root) {
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
    public static ArrayList inorder(node root,ArrayList<Integer> list){
        if(root == null){
            return list;
        }
            inorder(root.left,list);
            list.add(root.data);
            inorder(root.right,list);
            return list;
    }
    public static void main(String[] args) {
        int data[]  = {5,3,30,56,4,58,66,99,77,88};
        node root = null;
        for(int i=0;i<data.length;i++){
            root = insertNode(root,data[i]);
        }
        // InOrder(root);
        // // System.out.println(search(root, 3));
        // deleteNode(root, 58);
        // System.out.println();
        // InOrder(root);
        System.out.println(isValidBST(root));

    }
}
