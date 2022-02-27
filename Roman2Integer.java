// https://leetcode.com/problems/roman-to-integer/

import java.util.Map;

class Roman2Integer {
   public static int romanToInt(String s) {
      Map<Character, Integer> romans = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000);

      int integer = 0, i, inputLength = s.length(), first, second;
      for (i = 0; i < inputLength - 1; i++) {
         first = romans.get(s.charAt(i));
         second = romans.get(s.charAt(i + 1));
         if (first < second) {
            integer -= first;
         } else {
            integer += first;
         }
      }

      return integer + romans.get(s.charAt(inputLength - 1));
      // char ch = '0';
      // for (i = 0 ; i < inputLength ; i++) {
      // try {
      // ch = s.charAt(i);
      // if (ch == 'I') {
      // if (s.charAt(i + 1) == 'V') {
      // integer += 4;
      // i++;
      // } else if (s.charAt(i + 1) == 'X') {
      // integer += 9;
      // i++;
      // } else {
      // integer += romans.get(String.valueOf(ch));
      // }
      // } else if (ch == 'X') {
      // if (s.charAt(i + 1) == 'L') {
      // integer += 40;
      // i++;
      // } else if (s.charAt(i + 1) == 'C') {
      // integer += 90;
      // i++;
      // } else {
      // integer += romans.get(String.valueOf(ch));
      // }
      // } else if (ch == 'C') {
      // if (s.charAt(i + 1) == 'D') {
      // integer += 400;
      // i++;
      // } else if (s.charAt(i + 1) == 'M') {
      // integer += 900;
      // i++;
      // } else {
      // integer += romans.get(String.valueOf(ch));
      // }
      // } else {
      // integer += romans.get(String.valueOf(ch));
      // }
      // } catch (IndexOutOfBoundsException ex) {
      // integer += romans.get(String.valueOf(ch));
      // }
      // }
      // return integer;
   }

   public static void main(String[] args) {
      System.out.println(romanToInt("LVIII"));
   }
}