class p100237_leetcode {
    public static int countSubmatrices(int[][] grid, int k) {
    int count = 0;
    return fn(grid, 0, 0, 0, k);

}

public static  int fn(int grid[][], int r, int c, int count, int k) {
    int sum = 0;
    if (r == grid.length || c == grid[0].length) {
        return count;
    }
    for (int i = r; i < grid.length; i++) {
        for (int j = c; j < grid[0].length; j++) {
            sum += grid[i][j];
        }
    }
    if(sum<= k){
        count++;
    }
    int f = fn(grid, r + 1, c, count, k); 
    int s = fn(grid, r, c + 1, count, k); 
    return f + s;
}
public static void main(String[] args) {
    int[][] arr = new int[][]{{7,6,3},{6,6,1}};
    int k = 18;
    System.out.println(countSubmatrices(arr, k));
}
}