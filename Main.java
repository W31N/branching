import java.util.Random;

class Main{
    public static void main(String[] args) {
        int size = 5;
        int[][] matrix = new int[size][size];
        fillMatrix(matrix);
        printMatrix(matrix);
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