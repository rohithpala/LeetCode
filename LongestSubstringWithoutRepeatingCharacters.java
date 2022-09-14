import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
   static int lengthOfLongestSubstring(String s) {
      int len = s.length();
      
      if (len == 0 || len == 1) return len;

      HashMap<Character, Integer> characterMap = new HashMap<>();
      char ch;
      int prevCharIndex = 0, max = 0;

      characterMap.put(s.charAt(0), 0);

      for (int i = 1; i < len; i++) {
         ch = s.charAt(i);
         if (characterMap.containsKey(ch)) {
            // calcCh = characterMap.get(ch) + 1
            // prevCharIndex is changed to calcCh,
            // because there is no "ch" between prevCharIndex and calcCh,
            // because if "ch" was present in between them, then the calcCh will be different
            prevCharIndex = Math.max(prevCharIndex, characterMap.get(ch) + 1);
         }
         characterMap.put(ch, i);
         max = Math.max(max, i - prevCharIndex + 1);
      }
      
      return max;
   }

   public static void main(String[] args) {
      System.out.println(lengthOfLongestSubstring("dvdf"));
   }
}
