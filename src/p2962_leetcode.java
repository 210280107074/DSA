class p2962_leetcode {
    public static long countSubarrays(int[] nums, int k) {
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
           if(nums[i]>max){
               max=nums[i];
           }
        }
           int i = 0;
           int ans = 0;
           int count = 0;
           int j=0;
           while(i<nums.length){
               while(j<nums.length){
                   if(nums[j] == max && count != k){
                       count++;
                   }
                   if(count == k){
                       if(i==0){
                           ans = 1;
                       }
                       ans = ans + nums.length - 1 - j;
                       break;
                   }
                   else{
                       j++;
                   } 
               }
               if(nums[i] == max){
                   count = count - 1;
               }
               i++;
           }
           return ans;
       }
    public static void main(String[] args) {
        int[] nums = new int[]{61,23,38,23,56,40,82,56,82,82,82,70,8,69,8,7,19,14,58,42,82,10,82,78,15,82};
        System.out.println(countSubarrays(nums, 1));
    }
}