import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

    public static List<String> generatePermutations(String str) {
        List<String> result = new ArrayList<>();
        System.out.println("Generating permutations for: " + str);
        stringPermutation("", str, result);
        return result;
    }

    public static void stringPermutation(String current, String remaining, List<String> result) {
        System.out.println("Current state - current: \"" + current + "\", remaining: \"" + remaining + "\"");

        if (remaining.equals("")) {
            result.add(current);
            System.out.println("Added to result: \"" + current + "\"");
        }

        int n = remaining.length();
        for (int i = 0; i < n; i++) {
            String newCurrent = current + remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);

            System.out.println("Exploring permutation - newCurrent: \"" + newCurrent + "\", newRemaining: \"" + newRemaining + "\"");
            
            stringPermutation(newCurrent, newRemaining, result);
        }

        System.out.println("Returning from recursion - current: \"" + current + "\", remaining: \"" + remaining + "\"");
    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> permutations = generatePermutations(input);

        // Print the result
        System.out.println("Permutations:");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
}
