
public class p1155_leetcode {
    public static int numRollsToTarget(int n, int k, int target) {
        int dp[][] = new int[n+1][target+1];
        dp[0][0] = 1;
        int mod = 1000000007;
        for(int dice=1;dice<=n;dice++){
            for(int t=1;t<=target;t++){
                int ans = 0;
                
                    for(int i=1;i<=k;i++){
                        if(t-i >= 0){
                        ans = (ans + dp[dice-1][t-i])%mod;
                        }
                    }
                dp[dice][t] = ans;
            }

        }
        return dp[n][target];
    }
public static void main(String[] args) {
    int n = 30, k = 30,  target = 500;
    System.out.println(numRollsToTarget(n, k, target));
}
    
}