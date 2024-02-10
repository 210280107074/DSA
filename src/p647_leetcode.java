class p647_leetcode {

    public static int countSubstrings(String s) {
        return find(s);
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
    public static int find(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String sub = str.substring(i, j);
                if(isPalindrom(0, sub.length()-1, sub))
                {
                    count++;
                    
                }
            }
        }
        return count;
    }

    public static int countSubstringsUsingDP(String s) {
        int dp[][] = new int[s.length()][s.length()];
        return findUsingDP(s,dp);
    }
    public static boolean isPalindromWithDP(int i,int j,String s,int dp[][]){
        if(i>=j){
            return true;
        }
       else if(s.charAt(i)==s.charAt(j)){
        dp[i][j] = 1;
            return isPalindrom(i+1,j-1,s);
        }
        else{
            dp[i][j] = 0;
            return false;
        }
    }
    public static int findUsingDP(String str,int dp[][]){
        int count = 0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String sub = str.substring(i, j);
                if(isPalindromWithDP(0, sub.length()-1, sub,dp))
                {
                    count++;
                }
            }
        }
        return count;
    }


    public static int solve(String s){
        boolean t[][] = new boolean[s.length()][s.length()];
        int count = 0;
        for(int l = 1;l<=s.length();l++){
            for(int i=0;i+l-1<s.length();i++){
                int j = i+l-1;
                if(i == j){
                    t[i][j] = true;
                }
                else if(i+1 == j){
                    if(s.charAt(i) == s.charAt(j)){
                        t[i][j] = true ;
                    }
                    else{
                        t[i][j] = false;
                    }
                }
                else{
                    t[i][j] = (s.charAt(i) == s.charAt(j) && t[i+1][j-1] == true);
                }

                if(t[i][j] == true){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
        System.out.println(solve("aaa"));
    }
}