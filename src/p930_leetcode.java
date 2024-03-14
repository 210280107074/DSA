public class p930_leetcode {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int count = 0;
        int count_zero =0 ;
        while(j<nums.length){
            sum = sum + nums[j];
            while(i<j && (nums[i] == 0 || sum > goal)){
                if(nums[i]==0){
                    count_zero++;
                }
                else{
                    count_zero = 0;
                }
                sum = sum - nums[i];
                i++;
            }
            if(sum == goal){
                count = count+ 1 +count_zero;
            }
            j++;
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = new int[]{1,0,1,0,1};
        System.out.println(numSubarraysWithSum(nums, 2));
    }
}
