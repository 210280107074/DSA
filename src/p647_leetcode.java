class p647_leetcode {
    public static int countSubstrings(String s) {
        int dp[] = new int[s.length()];
        return find(s,dp);
    }
    public static boolean isPalindrom(int i,int j,String s){
        if(i>=j){
            return true;
        }
       else if(s.charAt(i)==s.charAt(j)){
            return isPalindrom(i+1,j-1,s);
        }
        else{
            return false;
        }
    }
    public static boolean isPalindrom(int i,int j,String s){
        if(i>=j){
            return true;
        }
       else if(s.charAt(i)==s.charAt(j)){
            return isPalindrom(i+1,j-1,s);
        }
        else{
            return false;
        }
    }
    public static int find(String str,int dp[]){
        int count = 0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String sub = str.substring(i, j);
                if(isPalindrom(0, sub.length()-1, sub))
                {
                    count++;
                    dp[i] = count;
                }
            }
        }
        return dp[str.length()-1];
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
    }
}