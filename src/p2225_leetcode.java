import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class p2225_leetcode {
    public static List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> lost = new HashMap<>();
        ArrayList<Integer> win = new ArrayList<>();
        ArrayList<Integer> loss = new ArrayList<>();
        Set<Integer> keys = new HashSet<>();
        for (int[] match : matches) {
            lost.put(match[1], lost.getOrDefault(match[1], 0) + 1);
        }
        for (int[] match : matches) {
            for (int element : match) {
                keys.add(element);
            }
        }
        for (Integer element : keys) {
            if (!lost.containsKey(element)) {
                win.add(element);
            } else if (lost.get(element) == 1) {
                loss.add(element);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        Collections.sort(win);
        Collections.sort(lost);
        ans.add(win);
        ans.add(loss);
        return ans;
    }

    public static void main(String[] args) {
        int[][] matches = {{1, 3},{1,4}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        List<List<Integer>> result = findWinners(matches);
        System.out.println("Winners: " + result.get(0));
        System.out.println("Loss: " + result.get(1));
    }
}
