package lab1_1;

public class lab1_5 {
    public static void fillInMatrix(int[][] matrix, final int rows, final int columns) {
        for (int i = 0; i < rows; ++i)
            for (int k = 0; k < columns; ++k) {
                matrix[i][k] = i + k + 1;
            }
    }
    public static void printMatrix(int[][] matrix, final int rows, final int columns){
        for (int i = 0; i < rows; ++i) {
            System.out.println();
            for (int k = 0; k < columns; ++k) {
                System.out.print(matrix[i][k] + " ");
            }
        }
    }
    public static int[][] transMatrix(int[][] matrix, final int rows, final int columns){
        int[][] tmpMatrix = new int[columns][rows];
        for (int i = 0; i < rows; ++i) {
            for (int k = 0; k < columns; ++k) {
                tmpMatrix[k][i] = matrix[i][k];
            }
        }
        return tmpMatrix;
    }
    public static void main(String[] args) {
        int rows = 3;
        int columns = 5;

        int[][] matrix = new int[rows][columns];
        fillInMatrix(matrix, matrix.length, matrix[0].length);
        printMatrix(matrix, matrix.length, matrix[0].length);
        System.out.println();
        matrix = transMatrix(matrix,matrix.length, matrix[0].length);
        printMatrix(matrix,matrix.length, matrix[0].length);
    }
}
