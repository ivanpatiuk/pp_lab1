package lab1_1;

public class lab1_6 {
    public static void fullMatrix(int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; ++i)
            for (int k = 0; k < columns; ++k) {
                matrix[i][k] = i + k + 1;
            }
    }
    public static void printMatrix(int[][] matrix, int rows, int columns){
        for (int i = 0; i < rows; ++i) {
            System.out.println();
            for (int k = 0; k < columns; ++k) {
                System.out.print(matrix[i][k] + " ");
            }
        }
        System.out.println();
    }
    public static int[][] multMatrix(int[][] matrix1, int[][] matrix2) {
        if(matrix1[0].length!=matrix2.length)
            return null;
        int m1ColLength = matrix1[0].length;

        int mRRowLength = matrix1.length;
        int mRColLength = matrix2[0].length;
        int[][] mResult = new int[mRRowLength][mRColLength];
        for(int i = 0; i < mRRowLength; i++) {
            for(int j = 0; j < mRColLength; j++) {
                for(int k = 0; k < m1ColLength; k++) {
                    mResult[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return mResult;
    }
    public static void main(String[] args) {
        int[][] a = new int[3][2];
        int[][] b = new int[2][5];
        fullMatrix(a,a.length,a[0].length);
        fullMatrix(b,b.length,b[0].length);
        printMatrix(a,a.length,a[0].length);
        printMatrix(b,b.length,b[0].length);
        int[][] c = multMatrix(a,b);
        printMatrix(c,c.length,c[0].length);
    }
}
