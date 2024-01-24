public class GFG_smallest_window {
    public static int smallestSubstring(String s) {
        int count = 0;
        int length = 0;
        int prev_length = 0;
        int i=0;
        int j=-1;
        int ans = 0;
       while(j<s.length()-1){
           if(count==6){
               length = j-i+1;
               ans = Math.min(length,prev_length);
               prev_length = ans;
            }
            if(count<6){
              j++;
              count = count + countOfChar(s.charAt(j));
            }
            if(count>6){
               count = count - countOfChar(s.charAt((i)));
               i++; 
            }
       }
       return ans;
    }
    public static int countOfChar(char ch){
         if(ch =='0'){
                return 1;
            }
            else if(ch=='1'){
                return 2;
            }
            else if(ch=='2'){
                return 3;
            }
            else{
            return 0;    
            }
    }
    public static void main(String[] args) {
        String s = new String();
        s = "121203";
        System.out.println(smallestSubstring(s));
    }
}
