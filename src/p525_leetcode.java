import java.util.HashMap;

class p525_leetcode{
    public static int fn(int nums[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int i=0;
        int sum = 0;
        int result = 0;
        while(i<nums.length){
            if(nums[i]==0)
            {
                sum = sum - 1;
            }
            else{
                sum++;
            }
            if(map.containsKey(sum)){
                result = Math.max(result,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = new int[]{0,1,0};
        System.out.println(fn(nums)); 
    }
}