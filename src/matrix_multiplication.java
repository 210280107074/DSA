import java.util.Arrays;

public class matrix_multiplication {
    public static int[][] mat_mult(int [][] m1,int[][] m2){
        int result[][] = new int[m1.length][m2[0].length];
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m2[0].length;j++){
                result[i][j] = result[i][j] + m1[i][j]*m2[j][i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] mat1 = {{1,0},{1,1}};
        int[][] mat2 = {{2,1},{3,2}};
        int result[][] = new int[mat1.length][mat2[0].length];
        result = mat_mult(mat1, mat2);

        System.out.println(Arrays.deepToString(result));

    }
    
}
