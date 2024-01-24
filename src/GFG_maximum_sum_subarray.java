// public class GFG_maximum_sum_subarray {
//     public static int maximumsum(int []nums){
//         int total = 0;
//         for(int i=0;i<nums.length;i++){
//             total = total + nums[i];
//         }
//         for(int i=(nums.length-1);i>=0;i--){
//             total = Math.max(total,total-nums[i]);
//         }
//         return total;
//     }
//     public static long kadansalgo(long []nums){
//         long current = 0;
//         long total = 0;
//         for(int i=0;i<nums.length;i++){
//             current = Math.max(nums[i],current+nums[i]);
//             total = Math.max(total,current);
//         }
//         return total;
//     }
//     public static void main(String[] args) {
//         long nums[] = {-1,-2,-3,-2,-5};
//         // System.out.println(maximumsum(nums));
//         System.out.println(kadansalgo(nums));
//     }
// }
public class GFG_maximum_sum_subarray {

    public static int maxSubarraySum(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, -4, -1, -2, -1, -5, -3};
        int result = maxSubarraySum(arr);

        System.out.println("Maximum subarray sum: " + result);
    }
}
