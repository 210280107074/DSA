import java.util.HashMap;

public class GFG_count_occurence {
    public static int countOccurence(int[] arr, int n, int k) 
    {
     HashMap <Integer,Integer> occurence = new HashMap<>();
     int oc = n/k;
     int value = 0;
     int total = 0;
     for(int i=0;i<arr.length;i++){
        if(occurence.containsKey(arr[i])){
            value = occurence.get(arr[i]);
            value++;
            occurence.put(arr[i],value);
        }
        else{
            occurence.put(arr[i],1);
        }
     }
     for(int key:occurence.keySet()){
        if(occurence.get(key) > oc){
            total++;
        }
     }
     return total;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,2,1,2,3,3};
        int N = 8;
        int k = 4;
        System.out.println(countOccurence(arr, N, k));
    }
}
