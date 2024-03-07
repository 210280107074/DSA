import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GFG_0803 {
    static boolean sameFreq(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        // if(set.size()>2){
        //     return false;
        // }
        System.out.println(map);
        int sub = 0;
        int count = 0;
        boolean flag = true;
        // int sub = 0;
        int i = 0;
        for(Integer val : set){
            // System.out.println(val);
            if(i==0){
                sub = val;
            }
            else{
                sub = Math.max(sub,val) - Math.min(sub,val); 
            }
            if(i != 0 && flag == true && sub == 1){
                flag = false;
            }
            if(i != 0&& sub > 1 ){
                return false;
            }
            i++;
        }
        return true;
     }
     public static void main(String[] args) {
        String s = "xxxyyyaabb";
        System.out.println(sameFreq(s));
     }
}
