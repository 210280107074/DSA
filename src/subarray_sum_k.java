import java.util.HashMap;

public class subarray_sum_k {
    public static int fn(int nums[],int k){
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {

            sum = sum + nums[i] ;
            
            if(map.containsKey(sum-k)){
                count= count + map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static int non_cont_sumsubarray(int nums[],int target){
        
        return solve(nums,0,0,target);

    }
    public static int solve(int nums[],int idx,int curr,int sum){
        if(idx == nums.length){
            if(curr == sum)
            {
                return 1;
            }
            else{
                return 0;
            }
        }
        int takeit = solve(nums,idx+1,curr+nums[idx],sum);
        int leaveit = solve(nums,idx+1,curr,sum);

        return takeit+leaveit;

    }
    public static void main(String[] args) {
        int nums[] = new int[]{1,1,1};
        int target = 2;
        System.out.println(fn(nums,target));
        System.out.println(non_cont_sumsubarray(nums, target));
    }
}
