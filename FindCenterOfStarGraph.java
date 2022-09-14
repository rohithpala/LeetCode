import java.util.HashMap;;

public class FindCenterOfStarGraph {
   static int findCenter(int[][] edges) {
      HashMap<Integer, Integer> count = new HashMap<>();
      int i, j, len = edges.length, node, max = 0, maxNode = edges[0][0];
      for (i = 0; i < len; i++) {
         for (j = 0; j < 2; j++) {
            node = edges[i][j];
            if (count.containsKey(node)) {
               count.put(node, count.get(node) + 1);
            } else {
               count.put(node, 1);
            }

            if (count.get(node) > max) {
               max = count.get(node);
               maxNode = node;
            }
         }
      }
      return maxNode;
   }

   public static void main(String[] args) {
      int[][] edges = { { 1, 2 }, { 2, 3 }, { 4, 2 } };
      System.out.println(findCenter(edges));
   }
}