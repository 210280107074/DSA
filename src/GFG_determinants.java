public class GFG_determinants {
    static int determinantOfMatrix(int matrix[][], int n)
    {
        if(n==1) return matrix[0][0];
        if(n==2) return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
        int det = 0;
        for(int i=0;i<n;i++){
            int cof = (int)Math.pow(-1,i)*matrix[0][i]*determinantOfMatrix(submatrix(matrix,0,1), n-1);
            det = det + cof;
        }

        return det;
    }
    static int[][] submatrix(int mat[][],int r,int c){
        int n = mat.length;
        int arr[][] = new int[n-1][n-1];
        int row = 0;
        int col = 0;
        for(int i=0;i<n;i++){
            if(i!=r){
                for(int j=0;j<n;j++){
                    if(j!=c){
                         arr[row][col] = mat[i][j];
                         col++;   
                    }
                }
                col=0;
                row++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
       int n = 4;
       int matrix[][] = {{1, 0, 2, -1},
              {3, 0, 0, 5},
              {2, 1, 4, -3},
              {1, 0, 5, 0}};
        System.out.println(determinantOfMatrix(matrix, n));
    }
}
