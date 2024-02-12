class p1_leetcode {
    public static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        int sum;
        int flag = 0;
        int i = 0;
        int j = nums.length - 1;

        while (i < nums.length && j >= 0) {
            sum = nums[i]+nums[j];
            if(j<=i){
                i++;
                j = nums.length - 1;
            }
            else if(target == sum){
                ans[0] = i;
                ans[1] = j;
                System.out.println(i);
                System.out.println(j);
                return ans;
            }
            else{
                j--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,4};
        int ans[] = new int[2];
        ans = twoSum(arr, 6);
      
    }
}
