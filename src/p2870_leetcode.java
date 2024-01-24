import java.util.HashMap;
import java.util.Map.Entry;

public class p2870_leetcode {
    public static int minOperations(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }
        for(Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()%3 == 0){
                ans = ans + entry.getValue()/3;
            }
            else if(entry.getValue()%3 != 0 && entry.getValue() > 1 && entry.getValue() != 2){
                ans = ans + entry.getValue()/3 + 1;
            }
            else if(entry.getValue() == 2){
                ans = ans + 1;
            } 
            else{
                return -1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] nums = new int[]{13,7,13,7,13,7,13,13,7};
        System.out.println(minOperations(nums));
    }
    
}
