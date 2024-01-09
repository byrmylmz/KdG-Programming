package Solutions.SWeek6;

public class A11_matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[4][6];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (row + 1) * (col + 1);
            }
        }

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%2d ", value);
            }
            System.out.println();
        }
    }
}
