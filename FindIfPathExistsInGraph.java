public class FindIfPathExistsInGraph {
   static boolean dfs(int n, int[][] graph, int source, int destination, boolean[] visited) {
      System.out.println(source + " " + destination);
      if (source == destination)
         return true;

      visited[source] = true;
      for (int i = 0; i < n; i++) {
         if (graph[source][i] == 1 && !visited[i]) {
            visited[i] = true;
            return dfs(n, graph, i, destination, visited);
         }
      }
      return false;
   }

   static boolean validPath(int n, int[][] edges, int source, int destination) {
      System.out.println(edges.length);
      int i;
      int[][] graph = new int[n][n];

      for (i = 0; i < n; i++) {
         graph[edges[i][0]][edges[i][1]] = 1;
         graph[edges[i][1]][edges[i][0]] = 1;
      }

      if(graph[source][destination] == 1) return true;

      for (i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            System.out.print(graph[i][j] + " ");
         }
         System.out.println();
      }

      boolean[] visited = new boolean[n];
      return dfs(n, graph, source, destination, visited);
   }

   public static void main(String[] args) {
      int[][] edges = {{0,7},{0,8},{6,1},{2,0},{0,4},{5,8},{4,7},{1,3},{3,5},{6,5}};
      int n = 10, source = 7, destination = 5;
      System.out.println(validPath(n, edges, source, destination));
   }
}
