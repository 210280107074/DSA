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
    public static void main(String[] args) {
        int data[]  = {5,3,30,56,4,58,66,99,77,88};
        node root = null;
        for(int i=0;i<data.length;i++){
            root = insertNode(root,data[i]);
        }
        InOrder(root);
        // System.out.println(search(root, 3));
        deleteNode(root, 58);
        System.out.println();
        InOrder(root);
    }
}
