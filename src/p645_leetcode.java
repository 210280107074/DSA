
import java.util.HashMap;


public class p645_leetcode {
    public static int[] findErrorNums(int[] nums) {
        int [] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }
        int range = nums.length;
        for (Integer key : map.keySet()) {
            if(map.get(key) == 2){
                ans[0] = key;
                break;
            }

        }
        for(int i=1;i<=range;i++){
            if(!map.containsKey(i)){
                ans[1] = i;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1};
        int ans[] = findErrorNums(arr);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
