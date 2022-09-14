// https://leetcode.com/problems/pascals-triangle/

import java.util.*;
public class PascalsTriangle {
   public List<List<Integer>> generate(int n) {
       List<List<Integer>> pt = new ArrayList<>();
       List<Integer> row = new ArrayList<>();
       
       row.add(1);
       pt.add(row);
       
       if (n == 1)
           return pt;
       
       row = new ArrayList<>();
       row.add(1);
       row.add(1);
       pt.add(row);
       
       int i, j;
       for(i = 2 ; i < n ; i++) {
           row = new ArrayList<>();
           row.add(pt.get(i-1).get(0));
           for (j = 0 ; j < i-1 ; j++) {
               row.add(pt.get(i-1).get(j) + pt.get(i-1).get(j+1));
           }
           row.add(pt.get(i-1).get(j));
           pt.add(row);
       }
       
       return pt;
   }
}