import java.util.Arrays;

public class p198_leetcode {
    public static int rob(int[] nums) {
        return solve(nums,0,nums.length);
    }
    public static int solve(int nums[],int i,int n){
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);
        if(i>=n){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
            int select = nums[i]+solve(nums,i+2,n);
            int skip = solve(nums,i+1,n);
            return dp[i] = Math.max(skip,select);
        
    }
    // public static int rob(int[] nums) {
    //     if (nums.length == 0) {
    //         return 0; 
    //     }

    //     if (nums.length == 1) {
    //         return nums[0]; 
    //     }
    //     int sum = 0;
    //     for(int i=0;i<nums.length;i++){
    //         int j=i+2;
    //         int c_sum = nums[i];
    //         while(j<nums.length){
    //             if(j+1<nums.length && nums[j]<nums[j+1] ){
    //                 c_sum = c_sum + nums[j+1];
    //                 j=j+1;
    //             }
    //             else if(j+1<nums.length && nums[j]>=nums[j+1] ){
    //                 c_sum = c_sum + nums[j];
    //             }
    //             else{
    //                 c_sum = c_sum + nums[j];
    //             }
    //             j+=2;
    //         }
    //         System.out.println(nums[i] + "->" +c_sum);
    //         sum = Math.max(sum, c_sum);
    //     }
    //     return sum;
    // }
    public static void main(String[] args) {
        int arr[] = new int[]{2,4,8,9,9,3};
        System.out.println(rob(arr));
    }
}
