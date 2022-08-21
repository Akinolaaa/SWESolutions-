public class MatrixSolution {
    
    public static int[][] reshapeMatrix(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r * c) {
            return mat;
        }
        int[][] newMat = new int[r][c];

        int x = 0; // row
        int y = 0; // col
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++){
                newMat[x][y] = mat[i][j];;
                if(y < c) {
                    y++;
                } else {
                    x++;
                    y=0;
                }
            }
        }
        return newMat;
    }

    public static void main(String [] args) {
        int[][] matr = {{1,2},{3,4}};
        int[][] newMatr = reshapeMatrix(matr, 1, 4);
        for(int i=0; i<newMatr.length; i++) {
            for (int j = 0; j < newMatr[0].length; j++) {
                System.out.println(newMatr[i][j]);
            }
        }
        System.out.print(newMatr.length);
        System.out.println(newMatr[0].length);
    }
}