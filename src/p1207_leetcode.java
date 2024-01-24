import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class p1207_leetcode {
    public static boolean uniqueOccurrences(int[] arr) {
        Map <Integer,Integer> oc = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            oc.put(arr[i],oc.getOrDefault(arr[i], 0)+1);
        }
        Set <Integer> allKey = new HashSet<>();
        allKey.addAll(oc.values());
        // for(Integer key : allKey){
        //     int value = oc.get(key);
        //     oc.remove(key);
        //     if(oc.containsValue(value)){
        //         return false;
        //     }
        // }
        // return true;
        if(allKey.size() == oc.size()){
            return true;
        }
        return false;
    }
public static void main(String[] args) {
    int arr[] = {-3,0,1,-3,1,1,1,-3,10,0};
    System.out.println(uniqueOccurrences(arr));
}
    
}