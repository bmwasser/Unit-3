public class TicTacToe{
    
    public static void main (String[] args) { 
       char[][] gameBoard = {               
               {'O','X','X'},    
               {'X','X','O'},
               {'O','X','O'}
       };
       printBoard(gameBoard);
       System.out.println(isValid(gameBoard));
       System.out.println(checkWin(gameBoard));
   }

   public static void printBoard(char[][] gameBoard) {
        // could be greatly improved
        System.out.println("-------------");
        for (char[] row : gameBoard) {
           for(char cell : row) {
               System.out.print("| " + cell + " ");
           }
           System.out.println("|");
           System.out.println("-------------");        
        }   
   }

   public static boolean isValid(char[][] gameBoard){   
        for (char[] row : gameBoard){
        for (char play : row){
            if (play != 'X' && play != 'O' && play != ' '){
                return false;
            }
        }
    }
    
    return true;
    }

    public static char checkWin(char[][] gameBoard){
        final int BOARD = 3;
        for (int i = 0; i < BOARD; i++) {
        // Check rows
            if (gameBoard[i][0] != ' ' && gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][1] == gameBoard[i][2]) {
                return gameBoard[i][0];
            }
        // Check columns
            if (gameBoard[0][i] != ' ' && gameBoard[0][i] == gameBoard[1][i] && gameBoard[1][i] == gameBoard[2][i]) {
                return gameBoard[0][i];
            }
        // Check diagonals (top left to bottom right)
            if (gameBoard[0][0] != ' ' && gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2]) {
                return gameBoard[0][0];
            }
        // Check other diagonal (top right to bottom left)
            if (gameBoard[0][2] != ' ' && gameBoard[0][2] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][0]) {
                return gameBoard[0][2];
            }
        
        }
        return ' ';
    }

    
}
