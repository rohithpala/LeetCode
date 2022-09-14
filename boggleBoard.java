import java.util.*;

public class boggleBoard {
   boolean check(char[][] board, int x, int y, String word, int wordPointer, boolean[][] visited) {
      int i, j;
      for (i = x - 1; i <= x + 1; i++) {
         if (i >= 0) {
            for (j = y - 1; j <= y + 1; j++) {
               if (j >= 0) {
                  if (board[i][j] == word.charAt(wordPointer)) {
                     visited[i][j] = true;
                     return check(board, i, j, word, wordPointer++, visited);
                  }
               }
            }
         }
      }

      return false;
   }

   public List<String> findWords(char[][] board, String[] words) {
      int wordPointerI = 0, wordPointerJ = 0, i, j, m = board.length, n = board[0].length;
      List<String> result = new ArrayList<>();
      boolean[][] visited = new boolean[m][n];
      for (i = 0; i < m; i++) {
         for (j = 0; j < n; j++) {
            if (board[i][j] == words[wordPointerI].charAt(wordPointerJ)) {
               visited[i][j] = true;
               check(board, i, j, words[wordPointerI], wordPointerJ++, visited);
            }
         }
      }
      return result;
   }
}
