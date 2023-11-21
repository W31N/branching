import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = fillRandomMatrix(5, 5);
    }
    public static int[][] fillRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(1, 10); // Генерация случайных чисел от 0 до 10 (для примера)
            }
        }
        return matrix;
    }
}