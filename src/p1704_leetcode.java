import java.util.ArrayList;

public class p1704_leetcode {
    public static boolean halvesAreAlike(String s) {
        ArrayList <String> vowels = new ArrayList<>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        String temp =  s.toLowerCase();
        String first = temp.substring(0,temp.length()/2);
        String second = temp.substring(temp.length()/2, temp.length());
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<first.length();i++){
            if(vowels.contains(String.valueOf(first.charAt(i)))){
                count1++;
            }
        }
        for(int i=0;i<second.length();i++){
            if(vowels.contains(String.valueOf(second.charAt(i)))){
                count2++;
            }
        }
        return count1 == count2;
    }
    public static void main(String[] args) {
        String s = "tkPAdxpMfJiltOerItiv";
        System.out.println(halvesAreAlike(s));
    }
    
}
