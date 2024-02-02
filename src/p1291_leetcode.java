import java.util.ArrayList;
import java.util.List;

public class p1291_leetcode {
    public static List<Integer> sequentialDigits(int low, int high) {
        String l = String.valueOf(low);
        String h = String.valueOf(high);
        List<Integer> result = new ArrayList<>();
        int size = h.length();
        int size2 = l.length();
        for(int x=size2;x<=size;x++){
            for(int i=1;i<=(9-x)+1;i++){
                StringBuilder sb = new StringBuilder();
                int k=i;
                for(int j=1;j<=x;j++){
                    sb.append(k);
                    k++;
                }
                int num =Integer.parseInt(sb.toString());
                if(num<high){
                    result.add(num);
                }
            }
        }
        return result;

    }
    public static void main(String[] args) {
       System.out.println(sequentialDigits(1000, 13000));
    }
    
}
