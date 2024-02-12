import java.util.*;


public class p1347_leetcode {
    @SuppressWarnings("rawtypes")
    public static Map minSteps(String s, String t) {
        // Map<Character, Integer> list1 = new HashMap<>();
        // Map<Character, Integer> list2 = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        // list1.put(s.charAt(i), list1.getOrDefault(s.charAt(i), 0) + 1);
        // }
        // for (int i = 0; i < t.length(); i++) {
        // list2.put(t.charAt(i), list2.getOrDefault(t.charAt(i), 0) + 1);
        // }
        // int steps = 0;

        // for (Character entry : list1.keySet()) {

        // int value1 = list1.get(entry);
        // int value2 = list2.getOrDefault(entry, 0);

        // steps += Math.max(0, value1 - value2);
        // }
        Map<Character, Integer> list1 = new HashMap<>();
        Map<Character, Integer> list2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            list1.put(s.charAt(i), list1.getOrDefault(s.charAt(i), 0) + 1);
            list2.put(t.charAt(i), list2.getOrDefault(t.charAt(i), 0) + 1);
        }
        for (Character key : list2.keySet()) {
            if (list1.containsKey(key)) {
                if ((list2.get(key) > list1.get(key))) {
                    list1.put(key, 0);
                } else {
                    list1.put(key, list1.get(key) - list2.get(key));
                }
            }
        }
        int steps = 0;
        for (Character key : list1.keySet()) {
            steps = steps + list1.get(key);
        }
        return list1;
    }

    public static void main(String[] args) {
        String a = "leetcode";
        String b = "practice";
        System.out.println(minSteps(a, b));
    }
}
