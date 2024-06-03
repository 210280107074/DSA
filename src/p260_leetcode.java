class p260_leetcode{

    public static int[] singleNumber(int[] nums) {
        int[] ans  = new int[2];
        int xor = 0;
        for(int num : nums){
           xor = xor^num;
        }
        int mask = xor & (-(xor));
         int g1 = 0;
         int g2 = 0;
         for(int num : nums){
           if((num & mask) == 0){
               g1=g1^num;
           }
           else{
               g2 = g2^num;
           }
         } 
         ans[0] = g1;
         ans[1] = g2;
         return ans;
   }
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        
        System.out.println(singleNumber(nums)[0]);
        System.out.println(singleNumber(nums)[1]);
    }
}