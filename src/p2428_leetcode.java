import java.util.Arrays;

class p2428_leetcode{
    public static void main(String[] args) {
        int[][] grid = {{0,1,1},{1,0,1},{0,0,1}};
        onesMinusZeros(grid);
        for(int i=0;i<grid.length;i++){
            System.out.println(Arrays.toString(grid[i]));
        }        
    }
    public static int[][] onesMinusZeros(int[][] grid) {
        int row[] = new int[grid.length];
        int rowz[] = new int[grid.length];
        int col[] = new int[grid[0].length];
        int colz[] = new int[grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    row[i]++;
                    col[j]++;
                }
               else if(grid[i][j] == 0){
                    rowz[i]++;
                    colz[j]++;
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                grid[i][j] = row[i]+col[j]-rowz[i]-colz[j];
            }
        }
        return grid;
    }

}