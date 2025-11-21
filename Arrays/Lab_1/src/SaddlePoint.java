public class SaddlePoint {

    private int[][] matrix;
    private int size;

    public SaddlePoint(int size) {
        this.size = size;
        matrix = new int[size][size];
        fillMatrix();
    }

    // Fill matrix with random numbers
    private void fillMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int)(Math.random() * 100);
            }
        }
    }

    // Find minimum in row
    private int minInRow(int row) {
        int min = matrix[row][0];
        for (int j = 1; j < size; j++) {
            if (matrix[row][j] < min) {
                min = matrix[row][j];
            }
        }
        return min;
    }

    // Find maximum in column
    private int maxInColumn(int col) {
        int max = matrix[0][col];
        for (int i = 1; i < size; i++) {
            if (matrix[i][col] > max) {
                max = matrix[i][col];
            }
        }
        return max;
    }

    // Find saddle point
    public void findSaddlePoint() {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == minInRow(i) && matrix[i][j] == maxInColumn(j)) {
                    System.out.println("Saddle point found at [" + i + "][" + j + "] = " + matrix[i][j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No saddle point found");
        }
    }

    //Print matrix
    public void printMatrix() {
        System.out.println("Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SaddlePoint sp = new SaddlePoint(8);
        sp.printMatrix();
        sp.findSaddlePoint();
    }
}