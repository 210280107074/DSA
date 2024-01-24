import java.util.HashMap;
import java.util.Map;

public class ritiksol {
    static int row;
    static int col;
    static int min;
    static Map<String, Integer> memo;

    public static void main(String[] args) {
        // int[][] matrix = { { -19, 57 }, { -40, -5 } };
        // int[][] matrix = { { -19, 57 }, { -40, -5 } };
        int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
        System.out.println(minFallingPathSum(matrix));
    }

    static int minFallingPathSum(int[][] matrix) {
        row = matrix.length;
        col = matrix[0].length;
        min = Integer.MAX_VALUE;
        memo = new HashMap<>();

        for (int j = 0; j < col; j++) {
            int result = fn(matrix, 0, j, 0);
            min = Math.min(min, result);
        }

        return min;
    }

    static int fn(int[][] matrix, int i, int j, int sum) {
        String key = i + "," + j;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        sum += matrix[i][j];

        if (i == row - 1) {
            min = Math.min(min, sum);
            return sum;
        }

        int left = (j - 1 >= 0) ? fn(matrix, i + 1, j - 1, sum) : Integer.MAX_VALUE;
        int straight = fn(matrix, i + 1, j, sum);
        int right = (j + 1 < col) ? fn(matrix, i + 1, j + 1, sum) : Integer.MAX_VALUE;
        int result = Math.min(left, Math.min(straight, right));

        memo.put(key, result);
        return result;
    }
}
