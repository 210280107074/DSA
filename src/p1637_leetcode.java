import java.util.Arrays;

class p1637_leetcode {
    public static int maxWidthOfVerticalArea(int[][] points) {
        int[] x_co = new int[points.length];
        int ans = 0;

        for (int i = 0; i < points.length; i++) {
            x_co[i] = points[i][0]; // Store only the x-coordinate
            // x_co[i] = points[i][1]; // Store only the Y-coordinate
        }
         Arrays.sort(x_co);
         for (int i = 1; i < x_co.length; i++) {
            ans = Math.max(ans, x_co[i] - x_co[i - 1]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] points = {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
            System.out.println(maxWidthOfVerticalArea(points));
    }
}
