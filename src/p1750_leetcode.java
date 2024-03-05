public class p1750_leetcode {
    public static int minimumLength(String s) {
        int i = 0;
        int j = s.length() - 1; 
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                
                while (i < j && s.charAt(i) == s.charAt(i + 1)) {
                    i++;
                }
               
                while (i < j && s.charAt(j) == s.charAt(j - 1)) {
                    j--;
                }
                i++;
                j--;
            } else {
                break;
            }
            
        }
        if(j-i+1 < 0){
            return 0;
        }
        return j-i+1;
    }

    public static void main(String[] args) {
        String s = "ca";
        System.out.println(minimumLength(s));  
    }
}
