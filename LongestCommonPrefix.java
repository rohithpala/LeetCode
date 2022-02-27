// https://leetcode.com/problems/longest-common-prefix/

class LongestCommonPrefix {
   public static String longestCommonPrefix(String[] strs) {
      if (strs.length != 0) {
         String prefix = "";
         char tempPrefix;
         if (strs[0].equals("")) {
            return "";
         } else {
            tempPrefix = strs[0].charAt(0);
         }
         int i, index = 0, len = strs.length;
         boolean flag = false;
         while (true) {
            for (i = 0; i < len; i++) {
               if (strs[i].equals("")) {
                  return "";
               } else {
                  if (strs[i].charAt(index) == tempPrefix) {
                     flag = true;
                  } else {
                     flag = false;
                     break;
                  }
               }
            }

            if (flag) {
               prefix += strs[0].charAt(index);
               tempPrefix = strs[0].charAt(index + 1);
               index++;
            } else {
               return prefix;
            }
         }
      } else {
         return "";
      }
   }

   public static void main(String[] args) {
      System.out.println(longestCommonPrefix(new String[] { "dog", "", "dar" }));
   }
}