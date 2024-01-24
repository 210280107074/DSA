public class sum_subset {

    public static void subsetSum(int[] nums, int targetSum) {
        int n = nums.length;

        // Create a memoization table initialized with false
        boolean[][] dp = new boolean[n + 1][targetSum + 1];

        // Base case: If the target sum is 0, then an empty subset is a solution
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Fill the table using bottom-up dynamic programming
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= targetSum; j++) {
                // If the current element is greater than the target sum, exclude it
                if (nums[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // Include or exclude the current element based on the previous results
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                }
            }
        }

        // The bottom-right cell contains the result
        if (dp[n][targetSum]) {
            System.out.println("Subset with the given sum exists.");

            // If you need to find the actual subset, you can backtrack through the table
            int i = n, j = targetSum;
            while (i > 0 && j > 0) {
                // If the current element was included in the subset
                if (dp[i][j] && !dp[i - 1][j]) {
                    System.out.print(nums[i - 1] + " ");
                    j -= nums[i - 1];
                }
                i--;
            }
            System.out.println();
        } else {
            System.out.println("No subset with the given sum exists.");
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,7,9,11};
        int targetSum = 12;
        subsetSum(nums, targetSum);
    }
}
