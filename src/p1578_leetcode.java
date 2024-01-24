import java.util.HashMap;
import java.util.Map;

public class p1578_leetcode {
    public static StringBuilder minCost(String colors, int[] neededTime) {
        StringBuilder sb = new StringBuilder();
        int time = 0;
        int length = colors.length();
        int k=0;
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i) == colors.charAt(k)){
                if(neededTime[i]<neededTime[k]){
                    time = time + neededTime[i];
                    length--;
                }
                else{
                    time = time + neededTime[k];
                    k = i;
                    length--;
                }
            }
            else{
                sb.append(colors.charAt(k));
                k=i;
            }
        }
        return sb;
    }
    
    public static void main(String[] args) {
        String colors = "aaabbbabbbb";
        int[] neededTime = new int[]{3,5,10,7,5,3,5,5,4,8,1};
        System.out.println(minCost(colors, neededTime));
        // System.out.println(minCost2(colors, neededTime));
    }
}
