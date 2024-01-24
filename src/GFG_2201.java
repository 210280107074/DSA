import java.util.ArrayList;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class GFG_2201 {

    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        findPaths(root, new ArrayList<>(), 0, sum, result);
        return result;
        
    }
    public static void findPaths(Node root,ArrayList<Integer> currentPath,int sum,int total,ArrayList<ArrayList<Integer>> result){
        if(sum == total){
            if(!result.contains(currentPath))
            result.add(new ArrayList<>(currentPath));
        }
        if(root == null){
            return;
        }
        if(root.data < total){
            currentPath.add(root.data);
            sum = sum + root.data;
        }
        findPaths(root.left, currentPath, sum, total, result);
        findPaths(root.right, currentPath, sum, total, result);

        currentPath.remove(currentPath.size() - 1);
    }
    public static void main(String[] args) {
    
        Node root = new Node(10);
        root.left = new Node(28);
        root.right = new Node(13);
        root.right.left = new Node(14);
        root.right.right = new Node(15);
        root.right.left.left = new Node(21);
        root.right.left.right = new Node(22);
        root.right.right.left = new Node(23);
        root.right.right.right = new Node(24);

        int targetSum = 38;

        ArrayList<ArrayList<Integer>> paths = printPaths(root, targetSum);

        for (ArrayList<Integer> path : paths) {
            System.out.println(path);
        }
    }
}
