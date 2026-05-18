public class MagicSquare {
    
    public static void main(String[] args) {
        int [][] magicSquare = buildMagicSquare(7);
        printMagicSquare(magicSquare);
        sumMagicSquare(magicSquare);
    }


    public static void printMagicSquare(int[][] arr2D) {
        for (int r = 0; r < arr2D.length; r++) {
            for (int c = 0; c < arr2D[0].length; c++) {
                System.out.printf("%10d ", arr2D[r][c]);
            }
            System.out.println();
        }
    }

    public static int[][] buildMagicSquare(int n) {

        int[][] magicSquare = new int[n][n];
        int row = 0;
        int col = n / 2;
        magicSquare[row][col] = 1; 

        for (int i = 2; i <= n * n; i++) {
            int nextRow = (row - 1 + n) % n;
            int nextCol = (col + 1) % n;

            if (magicSquare[nextRow][nextCol] != 0) {
                // If occupied, move down from current location
                row = (row + 1) % n;
                // col remains the same
            } else {
                // If empty, move to the diagonal location
                row = nextRow;
                col = nextCol;
            }
            magicSquare[row][col] = i;
        }
        return magicSquare;
    }


    public static void sumMagicSquare(int[][] arr2D){

        for (int i = 0; i < arr2D.length; i++) {
            int rowSum = 0;
            System.out.print("Row " + i + " elements: ");
            for (int j = 0; j < arr2D[0].length; j++) {
                rowSum += arr2D[i][j];
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println(" | Total: " + rowSum);
        }

        for (int j = 0; j < arr2D.length; j++) {
            int colSum = 0;
            System.out.print("Column " + j + " elements: ");
            for (int i = 0; i < arr2D[0].length; i++) {
                colSum += arr2D[i][j];
                System.out.print(arr2D[i][j] + " "); 
            }
            System.out.println(" | Total: " + colSum);
        }

        int mainDiagSum = 0;
        int antiDiagSum = 0;
        for (int i = 0; i < arr2D.length; i++) {
            mainDiagSum += arr2D[i][i];
            antiDiagSum += arr2D[i][arr2D.length - 1 - i];
        }
        System.out.println("Main Diagonal Total: " + mainDiagSum);
        System.out.println("Anti-Diagonal Total: " + antiDiagSum);
    }

}
