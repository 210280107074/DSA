import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Maximum_of_all_subarrays_of_size_k {
     static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
       
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
       for(int i=0;i<k;i++){
           while(!deque.isEmpty()  && deque.peekLast() < arr[i]){
               deque.removeLast();
           }
           deque.addLast(arr[i]);
       }
       ans.add(deque.peekFirst());
       for(int i=k;i<arr.length;i++){
          
            while(!deque.isEmpty() && deque.peekLast() < arr[i]){
               deque.removeLast();
           }
           deque.addLast(arr[i]);
            if(deque.peekFirst() == arr[i-k]){
               deque.removeFirst();
           }
           ans.add(deque.peekFirst());
       }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int n = arr.length;
        System.out.println(max_of_subarrays(arr, n, k));
    }
}
