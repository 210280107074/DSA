import java.util.ArrayList;
import java.util.List;

public class p1239_leetcode {

    public static int maxLength(List<String> arr) {
        return solve(0, arr, arr.size(), "");
    }

    public static int solve(int i, List<String> arr, int n, String result) {
        int in = 0;
        int ex = 0;

        if (i >= n) {
            return result.length();
        }

        if (duplicate(arr.get(i), result)) {
            ex = solve(i + 1, arr, n, result);
        } else {
            in = solve(i + 1, arr, n, result + arr.get(i));
            ex = solve(i + 1, arr, n, result);
        }
        System.out.println(result);
        return Math.max(ex, in);
    }

    public static boolean duplicate(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (b.indexOf(c) != -1 && a.indexOf(c, i + 1) != -1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("un");
        s.add("iq");
        s.add("ue");
        System.out.println(maxLength(s));
    }
}
