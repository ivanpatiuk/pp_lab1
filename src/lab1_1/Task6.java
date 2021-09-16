package lab1_1;

public class Task6 {
    public static void fillInMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i)
            for (int k = 0; k < matrix[0].length; ++k) {
                matrix[i][k] = i + k + 1;
            }
    }
    public static void printMatrix(final int[][] matrix){
        if (matrix==null)
            return;
        for (int i = 0; i < matrix.length; ++i) {
            System.out.println();
            for (int k = 0; k < matrix[0].length; ++k) {
                System.out.print(matrix[i][k] + " ");
            }
        }
        System.out.println();
    }
    public static int[][] multMatrix(final int[][] matrix1, final int[][] matrix2) {
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
        fillInMatrix(a);
        fillInMatrix(b);
        printMatrix(a);
        printMatrix(b);
        int[][] c = multMatrix(a,b);
        printMatrix(c);
    }
}
