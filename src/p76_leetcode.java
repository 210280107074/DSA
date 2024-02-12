import java.util.ArrayList;


public class p76_leetcode{
    public static String minWindow(String s, String t) {
        ArrayList<Character> a = new ArrayList<>();
        for(int i=0;i<t.length();i++){
            a.add(t.charAt(i));
        }
        int i = 0;
        int j = 0;
        String ans="";
        int tlen = Integer.MAX_VALUE;
        while(i<s.length()){
            j = i;
            int k = 0;
            while(k!=t.length() && j<s.length()){
                if(a.contains(s.charAt(j))){
                    k++;
                    j++;
                }
                else{
                    j++;
                }
            }
            if((j-i) < tlen && k == t.length()){
                ans = s.substring(i, j);
                tlen = ans.length();
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(minWindow("bba", "ab"));
    }
}