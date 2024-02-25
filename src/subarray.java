public class subarray {

    public static void printAllSubarrays(int[] nums) {
        for (int start = 0; start < nums.length; start++) {
            for (int end = start; end < nums.length; end++) {
                // Print the subarray from start to end
                for (int i = start; i <= end; i++) {
                    System.out.print(nums[i] + " ");
                }
                System.out.println();
            }
        }
    }
    

    public static void main(String[] args) {
        int[] nums = {-1, 2, 3};
        printAllSubarrays(nums);
    }
}
