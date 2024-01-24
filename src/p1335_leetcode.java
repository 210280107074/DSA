import java.util.Arrays;

public class p1335_leetcode {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int dp[][] = new int[jobDifficulty.length][d];

        if(d == 0 || (jobDifficulty.length < d)){
            return -1;
        }
        for(int i=0;i<jobDifficulty.length;i++){
            dp[i][1] =  Arrays.stream(jobDifficulty).max().orElseThrow();
        }
        for(int days = 2;days<d;days++){
            for(int i=0;i<(jobDifficulty.length - days);i++){
                int maxD = 0;
                int result = 0;
            for(int j = i;j<(jobDifficulty.length - days);j++){
                maxD = Math.max(maxD,jobDifficulty[j]);
                result = Math.min(result,maxD+dp[j+1][days-1]);
            }
            dp[i][days] = result;
            }
        }
        return dp[0][d];
    }
    public static void main(String[] args) {
        
    }
}
