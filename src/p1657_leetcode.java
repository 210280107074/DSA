import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;


public class p1657_leetcode {
    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        HashMap<Character, Integer> count1 = new HashMap<>();
        HashMap<Character, Integer> count2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            count1.put(word1.charAt(i), count1.getOrDefault(word1.charAt(i), 0) + 1);
            count2.put(word2.charAt(i), count2.getOrDefault(word2.charAt(i), 0) + 1);
        }

        if (!count1.keySet().equals(count2.keySet())) {
            return false;
        }

        ArrayList<Integer> list1 = new ArrayList<>(count1.values());
        ArrayList<Integer> list2 = new ArrayList<>(count2.values());
    
        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
        
    }
    public static void main(String[] args) {
        String a = "abbccc";
        String b = "cabbba";
        System.out.println(closeStrings(a, b));


    }
    
}
