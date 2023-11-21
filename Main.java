import java.util.Random;

class Main{
    public static void main(String[] args) {
        int size = 5;
        int[][] matrix = new int[size][size];
        fillMatrix(matrix);
        int[][] unitMatrix = getUnitMatrix(5);
        printMatrix(matrix);
        System.out.println();
        printMatrix(unitMatrix);
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
                matrix[i][j] = random.nextInt(1, 10);
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