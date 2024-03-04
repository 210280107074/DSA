import java.util.Arrays;

public class p948_leetcode{
    public static int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0; 
        int max = 0;
        int idx = tokens.length - 1;
        boolean vis[] = new boolean[tokens.length];
        for(int i=0;i<tokens.length;i++){
            if(power >= tokens[i] && vis[i] == false){
                power = power - tokens[i];
                vis[i] = true;
                score++;
            }
            else if(score >= 1 && power <= tokens[i] && vis[idx] == false){
                power = power + tokens[idx];
                idx--;
                i--;
                vis[i] = true;
                score--;
            }
        }
        return score;
    }
    public static void main(String[] args) {
        int[] tokens = new int[]{100,200,300,400};
        int power = 200;
        System.out.println(bagOfTokensScore(tokens, power));
    }
}