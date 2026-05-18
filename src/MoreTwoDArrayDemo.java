public class MoreTwoDArrayDemo {

    public static void main(String[] args) {
        int[][] a = new int[4][6]; // rows then columns
        a[0][0] = 15;
        a[3][5] = 15;
        a[1][4] = 12;
        int[][] b = createRandomArray(3, 4);
        print2D(b);
        System.out.println(colSum(b, 1));
        // int[][] bingo = makeRandomIntArray(5, 5);\
        int[][] nums = makeRandomIntArray(10, 25);
        System.out.println(countRowsExceeding(nums, 20));

        
    }

    /**
     * Searches an array in column order for the first occurrence
     * of a target value.
     * 
     * @param arr2D  an int[][] array to search
     * @param target the value to search for
     * @return an int[] array of length 2 with the row and column of
     *         the first occurrence of the target value, or null if not found
     */
    public static int[] searchByCol(int[][] arr2d, int target) {
        for (int c = 0; c < arr2d[0].length; c++) {
            for (int r = 0; r < arr2d.length; r++) {
                if (arr2d[r][c] == target) {
                    return new int[] { r, c };
                }
            }
        }
        return null;
    }

    /**
     * Creates a 2D int array of size row x col and fills it with random numbers
     * from 0 to 99.
     * 
     * @param row the number of rows
     * @param col the number of colums
     * @return an int[][] array of size row x col filled with random numbers form 0
     *         to 99
     */
    public static int[][] createRandomArray(int row, int col) {
        final int RANGE = 100;
        int[][] arr2d = new int[row][col];
        for (int r = 0; r < arr2d.length; r++) {
            for (int c = 0; c < arr2d[r].length; c++) {
                arr2d[r][c] = (int) (Math.random() * RANGE);
            }
        }
        return arr2d;
    }

    /**
     * Receives a 2D int array and a column index and returns
     * the sum of that column.
     * 
     * @param arr a 2D int array
     * @param col the column to sum
     * @return the sum of all elements in the specified column
     */
    public static int colSum(int[][] arr2d, int col) {
        int sum = 0;
        for (int r = 0; r < arr2d.length; r++) {
            sum += arr2d[r][col];
        }
        return sum;
    }

    /**
     * returns the sum of the specified row
     * 
     * @param arr2d
     * @param row
     * @return
     */
    public static int rowSum(int[][] arr2d, int row) {
        return 0;
    }

    public static void print2DArray(int[][] arr) {
        for (int r = 0; r < arr.length; r++) { // r is for row
            for (int c = 0; c < arr[r].length; c++) { // c is for column
                System.out.print(arr[r][c] + "   ");
            }
            System.out.println(); // print a line return at the end of every row
        }
    }

    public static void print2D(int[][] arr) {
        for (int[] row : arr) { // take each row from the array...
            for (int val : row) { // .. and then take each value from that row
                System.out.print(val + "   ");
            }
            System.out.println();
        }
    }

    // Creates an int array of size [rows][cols] and fills it with random values 0-99

    public static int[][] makeRandomIntArray(int rows, int cols){
        final int RANGE = 100;
        int arr[][] = new int[rows][cols];
        for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[0].length; c++){ 
                // TODO set the numbers as in an actual bingo card
                arr[r][c] = (int)(Math.random() * RANGE);
            }
        }
        return arr;
    }

    // Searches the array by columns for the first occurrence of target
    // Return a 1D array of two items {row,col} of first occurence 
    // or {-1,-1} if the target is not in the array

    public static int[] searchByColumn(int[][] arr, int target){
        int [] loc = {-1, -1};
        for (int c = 0; c < arr[0].length; c++){
            for (int r = 0; r < arr.length; r++){
                if (arr[r][c] == target){
                    loc[0] = r;
                    loc[1] = c;
                    return loc;
                }
            }
        }
        return loc;
    }

    // Returns true if the difference between any two consecutive elements
    // is equal to or greater than the threshold value
    // returns false otherwise

    public static boolean exceeds(int[] arr, int threshold){
        for (int i = 0; i < arr.length - 1; i++){
            if(Math.abs(arr[i] - arr[i + 1]) >= threshold){
                return true;
            }
        }
        return false;
    }

    // Receives a 2D int array and counts how many rows have 
    // changes in value that exceed the given threshold
    // returns the count of rows

    public static int countRowsExceeding(int[][] arr, int threshold){
        int count = 0;
        for (int[] row : arr){
            if (exceeds(row, threshold)){
                count++;
            }
        }
        return count;
    }

}