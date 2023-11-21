import java.util.Random;

class Main{
    public static void main(String[] args) {
        int size = 10;
        int[][] firstMatrix = new int[size][size];
        int[][] secondMatrix = new int[size][size];
        fillMatrix(firstMatrix);
        fillMatrix(secondMatrix);
        int[][] unitMatrix = getUnitMatrix(size);
        printMatrix(firstMatrix);
        System.out.println();
        printMatrix(secondMatrix);
        System.out.println();
        int[][] result = multiplyMatrices(firstMatrix, secondMatrix);
        printMatrix(result);
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] getUnitMatrix(int size){
        int[][] unitMatrix = new int[size][size];
        for (int i = 0; i < unitMatrix.length; i++) {
            for (int j = 0; j < unitMatrix[i].length; j++) {
                if (i == j){
                    unitMatrix[i][j] = 1;
                }
                else {
                    unitMatrix[i][j] = 0;
                }
            }
        }
        return unitMatrix;
    }

    public static void fillMatrix(int[][] matrix){
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100, 1000);
            }
        }
    }
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}