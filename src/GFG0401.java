import java.util.HashMap;
import java.util.Map.Entry;

public class GFG0401 {
    static int singleElement(int[] arr , int N) {
        HashMap<Integer,Integer> map = new HashMap<>(); 
        int count = 0;
        int ans = 0;
        for(int i=0;i<N;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        for(Entry<Integer, Integer> entry : map.entrySet()){
            count = count + entry.getValue();
            if(entry.getValue() == 1){
                ans = entry.getKey();
            }
        }
        if(count%3 != 1){
            return -1;
        }
        else {
                return ans;
        }

    }
    public static void main(String[] args) {
        int N = 10;
        int arr[] = new int[]{3, 2, 1, 34, 34, 1, 2, 34, 2, 1};
        System.out.println(singleElement(arr, N));
    }
}
