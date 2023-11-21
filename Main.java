import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = fillRandomMatrix(3, 3);
        printMatrix(matrix);
        System.out.println();
        int determinant = determinant(matrix);
        System.out.println(determinant);
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

    public static void printMatrix(int[][] matrix) {
        System.out.println("Матрица:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int determinant(int[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        } else if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else {
            int det = 0;
            for (int j = 0; j < n; j++) {
                det += Math.pow(-1, j) * matrix[0][j] * determinant(getSubMatrix(matrix, 0, j));
            }
            return det;
        }
    }

    // Вспомогательный метод для получения минора матрицы
    public static int[][] getSubMatrix(int[][] matrix, int excluding_row, int excluding_col) {
        int n = matrix.length;
        int[][] subMatrix = new int[n - 1][n - 1];
        int r = -1;
        for (int i = 0; i < n; i++) {
            if (i == excluding_row)
                continue;
            r++;
            int c = -1;
            for (int j = 0; j < n; j++) {
                if (j == excluding_col)
                    continue;
                subMatrix[r][++c] = matrix[i][j];
            }
        }
        return subMatrix;
    }
}
