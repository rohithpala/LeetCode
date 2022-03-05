// https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;

class ValidParentheses {
   public static boolean isValid(String s) {
      int len = s.length();
      if (len == 0 || len == 1) {
         return false;
      } else {
         Stack<Character> stack = new Stack<Character>();
         int i;
         char ch, top;
         for (i = 0; i < len; i++) {
            ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
               stack.push(s.charAt(i));
            } else {
               if (stack.empty()) {
                  return false;
               }
               top = stack.peek();
               if ((ch == ')' && top == '(') || (ch == ']' && top == '[') || (ch == '}' && top == '{')) {
                  stack.pop();
               } else {
                  return false;
               }
            }
         }

         if (stack.empty())
            return true;
         return false;
      }
   }

   public static void main(String[] args) {
      System.out.println(isValid("(])"));
   }
}