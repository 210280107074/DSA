public 
class p1208_leetcode {
    public static int equalSubstring(String s, String t, int maxCost) {
      int count = 0;
      int i = 0;
      int j = 0;
      boolean flag = false;
      while(i<s.length()){
        if(Math.abs((int)s.charAt(i)-(int)t.charAt(i)) <= maxCost){
            maxCost = maxCost - Math.abs((int)s.charAt(i)-(int)t.charAt(i));
            System.out.println(s.charAt(i));
            System.out.println(Math.abs((int)s.charAt(i)-(int)t.charAt(i)));
            count++;
            flag = true;
            i++;
        }
        else if(flag == true && Math.abs((int)s.charAt(i)-(int)t.charAt(i)) > maxCost){
            flag = false;
            break;
        }
        else{
            i++;
        }
      } 
      return count;
    }
    public static int equalSubstring2(String s, String t, int maxCost) {
        int ans = 0;
         int count = 0;
         int i = 0;
         int Ocost = maxCost;
         int j = 0;
         String r = "";
         while(i<s.length() && i<t.length()  && j<s.length() && j<t.length()){
             if(Math.abs((int)s.charAt(j)-(int)t.charAt(j)) <= maxCost){
                 maxCost = maxCost - Math.abs((int)s.charAt(j)-(int)t.charAt(j));
                 r = r+s.charAt(j);
                 j++;
             }
             else{
                 ans = Math.max((j-i),ans);
                System.out.println(r);
                 i++;
                 j = i;
                 r="";
                 maxCost = Ocost;
             }
         }
         return ans;
     }
  
    public static void main(String[] args) {
       String s = "krpgjbjjznpzdfy";
       String t = "nxargkbydxmsgby";
       int maxCost = 14;
       System.out.println( equalSubstring2(s, t, maxCost));
    }
} p1208_leetcode {
    
}
