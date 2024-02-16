import java.util.Arrays;

class p2971_leetcode{
    public static long largestPerimeter(int[] nums) {
        int sum = 0;
        int count = 0;
        int ans = 0;
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
                if(nums[i]<sum ){
                        ans = sum + nums[i];
                }
                    sum = sum + nums[i];
        }
        if(ans == 0){
            return -1;
        }
        else{
            return sum;
        }
    }
    

    public static void main(String[] args) {
        int arr[] = new int[]{1,1,2,3,5,12,50};
        System.out.println(largestPerimeter(arr));
    }
}