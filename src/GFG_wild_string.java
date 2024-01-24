
public class GFG_wild_string {
    class Solution{
        static boolean match(String wild, String pattern)
        {
            int p = 0;
            int k=0;
            boolean flag = true;
            for(int i=0;i<pattern.length();i++){
                if(wild.charAt(i)==pattern.charAt(k)){
                    k++;
                }
                else if(wild.charAt(i) != pattern.charAt(k)){
                    if(wild.charAt(i) == '?' && wild.charAt(i+1) == pattern.charAt(k+1)){
                        flag = true;
                    }
                    else if(wild.charAt(i) == '*'){
                        while(pattern.charAt(k) != wild.charAt(i+1)){
                            k++;
                        }
                    }
                    else{
                        flag = false;
                    }
                }
            }
            return flag;
        }
    }
    public static void main(String[] args) {
        
    }
    
}