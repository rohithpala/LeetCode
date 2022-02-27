class Solution {
   public static boolean isPalindrome(int x) {
      int rev = 0, temp = x;
      while (temp > 0) {
         rev = rev * 10 + (int) (temp % 10);
         temp /= 10;
      }
      if (rev == x) return true;
      return false;
   }

   public static void main(String[] args) {
      System.out.println(isPalindrome(121));
   }
}
