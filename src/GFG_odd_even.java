//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
import java.util.Map.Entry;
    
    class  GFG_odd_even{
        
        public static String oddEven(String s) {
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i=0;i<s.length();i++){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
            int ans = 0;
            for(Entry<Character, Integer> entry : map.entrySet()){
                char c = entry.getKey();
                if(c%2 == 0 && entry.getValue()%2 == 0 || c%2 == 1 && entry.getValue()%2 == 1 ){
                    ans = ans + 1;
                }
            }
            
            if(ans%2==0){
                return "EVEN";
            }
            else{
                return "ODD";
            }
    }
    public static void main(String[] args) {
        System.out.println(oddEven("nobitaa"));
    }
}
    
    
    
    
    