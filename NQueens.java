public class NQueens {
   boolean isSafe(String[][] board, int row, int col, int n) {
      int i, j;
      for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
         if (board[i][j] == "Q")
            return false;
      }
      for (i = row, j = col; i >= 0 && j < n; i--, j++) {
         if (board[i][j] == "Q")
            return false;
      }
      return true;
   }

   String[][] solveNQueens(int n) {
      int row, col;
      String[][] board = new String[n][n];
      int[] colHash = new int[n];
      for (row = 0; row < n; row++) {
         for (col = 0; col < n; col++) {
            board[row][col] = ".";
         }
      }
      for (row = 0; row < n; row++)
         colHash[row] = 0;
      for (row = 0; row < n; row++) {
         for (col = 0; col < n; col++) {
            if (colHash[col] == 0) {
               if (isSafe(board, row, col, n)) {
                  board[row][col] = "Q";
                  colHash[col] = 1;
                  break;
               } else {
                  board[row][col] = ".";
               }
            }
         }
      }
      return board;
   }

   public static void main(String[] args) {
      String[][] res = new NQueens().solveNQueens(4);
      for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 4; j++) {
            System.out.print(res[i][j] + " ");
         }
         System.out.println();
      }
   }
}
