/**
 * Magic Square Implementation
 * A magic square is a grid where the sums of numbers in each row,
 * each column, and both main diagonals are the same.
 */
public class MagicSquare {
    private int[][] square;
    private int size;

    // Constructor
    public MagicSquare(int size) {
        // Check if size is odd and positive
        if (size % 2 == 0 || size <= 0) {
            throw new IllegalArgumentException("Size must be an odd positive integer");
        }
        this.size = size;
        this.square = new int[size][size];
    }

    public static boolean isMagicSquare(int[][] square) {
        int n = square.length;

        // Check if it's a square matrix
        for (int i = 0; i < n; i++) {
            if (square[i].length != n) {
                return false;
            }
        }

        // Calculate the magic constant (what each row/column/diagonal should sum to)
        int magicConstant = n * (n * n + 1) / 2;

        // Check rows
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += square[i][j];
            }
            if (rowSum != magicConstant) {
                return false;
            }
        }

        // Check columns
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += square[i][j];
            }
            if (colSum != magicConstant) {
                return false;
            }
        }

        // Check main diagonal (top-left to bottom-right)
        int diag1Sum = 0;
        for (int i = 0; i < n; i++) {
            diag1Sum += square[i][i];
        }
        if (diag1Sum != magicConstant) {
            return false;
        }

        // Check secondary diagonal (top-right to bottom-left)
        int diag2Sum = 0;
        for (int i = 0; i < n; i++) {
            diag2Sum += square[i][n - 1 - i];
        }
        if (diag2Sum != magicConstant) {
            return false;
        }

        return true;
    }

    /**
     * Generates a magic square using the Siamese method
     * This method works for odd-sized squares
     */
    public void generateMagicSquare() {
        // Start with an empty square filled with zeros
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                square[i][j] = 0;
            }
        }

        // Start position: first row, middle column
        int row = 0;
        int col = size / 2;

        // Fill the square with numbers from 1 to size*size
        for (int number = 1; number <= size * size; number++) {
            // Place the current number
            square[row][col] = number;

            // Calculate next position: move up and right
            int nextRow = (row - 1 + size) % size; // Wrap around if needed
            int nextCol = (col + 1) % size;        // Wrap around if needed

            // If the next position is already occupied, move down instead
            if (square[nextRow][nextCol] != 0) {
                row = (row + 1) % size; // Move down (wrap around if needed)
            } else {
                // Move to the calculated next position
                row = nextRow;
                col = nextCol;
            }
        }
    }

    /**
     * Alternative generation method with more detailed comments
     * This method explicitly shows the wrapping rules
     */
    public void generateMagicSquareDetailed() {
        // Initialize all positions to 0
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                square[i][j] = 0;
            }
        }

        // Step 1: Start from the middle of the first row
        int currentRow = 0;
        int currentCol = size / 2;

        System.out.println("Starting at position: [" + currentRow + "][" + currentCol + "]");

        // Place numbers 1 through size*size
        for (int num = 1; num <= size * size; num++) {
            // Place the current number
            square[currentRow][currentCol] = num;
            System.out.println("Placed " + num + " at [" + currentRow + "][" + currentCol + "]");

            // Remember current position before moving
            int oldRow = currentRow;
            int oldCol = currentCol;

            // Rule 1: Move diagonally up-right
            currentRow = currentRow - 1; // Move up
            currentCol = currentCol + 1; // Move right

            // Rule 2: If we move above the top row, wrap to bottom row
            if (currentRow < 0) {
                currentRow = size - 1;
                System.out.println("  Wrapped from top to bottom row");
            }

            // Rule 3: If we move beyond the rightmost column, wrap to leftmost column
            if (currentCol >= size) {
                currentCol = 0;
                System.out.println("  Wrapped from right to left column");
            }

            // Rule 4: If the target cell is already occupied, move down from original position
            if (square[currentRow][currentCol] != 0) {
                System.out.println("  Position [" + currentRow + "][" + currentCol + "] is occupied, moving down instead");
                currentRow = oldRow + 1; // Move down from original position
                currentCol = oldCol;     // Stay in same column

                // If we move below bottom row, wrap to top row
                if (currentRow >= size) {
                    currentRow = 0;
                    System.out.println("  Wrapped from bottom to top row");
                }
            }
        }
    }

    /**
     * Prints the magic square in a formatted way
     */
    public void printSquare() {
        System.out.println("\nMagic Square " + size + "x" + size + ":");
        System.out.println("Magic Constant: " + (size * (size * size + 1) / 2));
        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Format numbers to be right-aligned
                System.out.printf("%4d", square[i][j]);
            }
            System.out.println();
        }

        // Verify and print the sums
        verifyAndPrintSums();
    }

    /**
     * Verifies the magic square and prints all sums
     */
    private void verifyAndPrintSums() {
        int magicConstant = size * (size * size + 1) / 2;
        System.out.println("\nVerification (all sums should be " + magicConstant + "):");

        // Print row sums
        System.out.print("Row sums:    ");
        for (int i = 0; i < size; i++) {
            int rowSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum += square[i][j];
            }
            System.out.print(rowSum + " ");
        }

        // Print column sums
        System.out.print("\nColumn sums: ");
        for (int j = 0; j < size; j++) {
            int colSum = 0;
            for (int i = 0; i < size; i++) {
                colSum += square[i][j];
            }
            System.out.print(colSum + " ");
        }

        // Print diagonal sums
        int diag1Sum = 0, diag2Sum = 0;
        for (int i = 0; i < size; i++) {
            diag1Sum += square[i][i];           // Main diagonal
            diag2Sum += square[i][size - 1 - i]; // Secondary diagonal
        }
        System.out.println("\nDiagonal sums: " + diag1Sum + " (main), " + diag2Sum + " (secondary)");

        // Final verification
        boolean isMagic = isMagicSquare(square);
        System.out.println("Is this a valid magic square? " + isMagic);
    }

    /**
     * Getter method to access the square array
     */
    public int[][] getSquare() {
        return square;
    }

    /**
     * Main method to test the Magic Square class
     */
    public static void main(String[] args) {
        System.out.println("=== MAGIC SQUARE DEMONSTRATION ===");

        // Test with size 3
        System.out.println("\n1. Testing with 3x3 Magic Square:");
        MagicSquare ms3 = new MagicSquare(3);
        ms3.generateMagicSquare();
        ms3.printSquare();

        // Test with size 5
        System.out.println("\n\n2. Testing with 5x5 Magic Square:");
        MagicSquare ms5 = new MagicSquare(5);
        ms5.generateMagicSquare();
        ms5.printSquare();

        // Test verification with a non-magic square
        System.out.println("\n\n3. Testing verification with non-magic square:");
        int[][] nonMagic = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Is this a magic square? " + isMagicSquare(nonMagic));

        // Test the detailed generation method
        System.out.println("\n\n4. Detailed generation of 3x3 Magic Square:");
        MagicSquare ms3Detailed = new MagicSquare(3);
        ms3Detailed.generateMagicSquareDetailed();
        ms3Detailed.printSquare();
    }
}