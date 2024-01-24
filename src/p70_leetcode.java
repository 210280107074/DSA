import java.util.Arrays;

public class p70_leetcode {
    public static int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return stairsclimb(0, n,dp);
    }

    public static int stairsclimb(int current, int remaining,int dp[]) {
        if (remaining == 0) {
           return 1;
        }
        if (remaining < 0) {
           return 0;
        }
        if (dp[remaining] != -1) {
            return dp[remaining];
        }
        int ans1 = stairsclimb(current + 1, remaining - 1,dp);
        int ans2 = stairsclimb(current + 2, remaining - 2,dp);
        dp[remaining] = ans1 + ans2;
        return dp[remaining];
    }
        public static int climbStairsRec(int n) {
            return stairsclimbRec(0, n);
        }
    
        public static int stairsclimbRec(int current, int remaining) {
            if (remaining == 0) {
                return 1;
            }
            if (remaining < 0) {
                return 0;
            }
            int ans1 = stairsclimbRec(current + 1, remaining - 1);
            int ans2 = stairsclimbRec(current + 2, remaining - 2);
            return ans1 + ans2;
        }
    public static void main(String[] args) {
        int n = 54;
        System.out.println(climbStairs(n));
    }
}
