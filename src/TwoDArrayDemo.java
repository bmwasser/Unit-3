
public class TwoDArrayDemo{

    public static void main(String[] args) {
        String[][] arr = makeStringArray(3,5);
        for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[0].length; c++){
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }

        String[][] rectangle = new String[5][6];
        String [][] shadedRectangle = makeShadedRect(rectangle,1,4,1,4);
        for (int r = 0; r < shadedRectangle.length; r++){
            for (int c = 0; c < shadedRectangle[0].length; c++){
                System.out.printf("%10s" + " ", shadedRectangle[r][c]);
            }
            System.out.println();
        }
        
        char [][] letters = {
            {'a','b','c','d','e'},
            {'f','g','h','i','j'},
            {'k','l','m','n','o'}
        };
        // classic "typeewriter-style" 2D traverse
        for (int r = 0; r < letters.length; r++){
            for (int c = 0; c < letters[0].length; c++){
                System.out.print(letters[r][c]);
            }
            // finished will all the columns in that row
            System.out.println();
        }
    }
        


    public static String [][] makeStringArray(int rows, int columns){
        String [][] arr = new String[rows][columns];
        for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[0].length; c++){
                arr[r][c] = "Row " + r + ", Column " + c;
            }
        }

        return arr;
    }

    public static String[][] makeShadedRect(String[][] arr, int startRow, int endRow, int startCol, int endCol){
        
        
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                arr[r][c] = "unshaded"; 
            }
        }

        
        for (int r = 0; r < arr.length; r++){
            if (r >= startRow && r < endRow){
                for (int c = 0; c < arr[0].length; c++){
                    if (c >= startCol && c < endCol){
                        arr[r][c] = "shaded";
                    }
                }
            }
        }
        return arr;
    }
        
}