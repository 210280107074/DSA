public class p125_leetcode {
    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return  palindrom(str, 0, str.length()-1);
    }
    public static boolean palindrom(String s,int i,int j){
        if(i>=j){
            return true;
        }
        if(s.charAt(i) == s.charAt(j)){
            return palindrom(s, i+1, j-1);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
