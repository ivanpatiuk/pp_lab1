package lab1_1;

public class Task5 {
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
    public static int[][] transMatrix(int[][] matrix){
        int[][] tmpMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; ++i) {
            for (int k = 0; k < matrix[0].length; ++k) {
                tmpMatrix[k][i] = matrix[i][k];
            }
        }
        return tmpMatrix;
    }
    public static void main(String[] args) {
        int rows = 3;
        int columns = 5;

        int[][] matrix = new int[rows][columns];
        fillInMatrix(matrix);
        printMatrix(matrix);
        System.out.println();
        matrix = transMatrix(matrix);
        printMatrix(matrix);
    }
}
