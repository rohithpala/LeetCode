public class RemoveDuplicatesFromSortedList2_1 {
   public void print(ListNode head) {
      while (head != null) {
         System.out.println(head.val);
         head = head.next;
      }
   }

   public ListNode deleteDuplicates(ListNode head) {
      if (head == null || head.next == null) return head;
      ListNode result = null, q = head;
      while (q != null) {
         
      }
      return result;
   }

   public static void main(String[] args) {
      int[] arr = {};
      ListNode p = null, q = p;
      for (int i = 0; i < arr.length; i++) {
         if (q == null) {
            q = new ListNode(arr[i], null);
         } else {
            q.next = new ListNode(arr[i], null);
            q = q.next;
         }
      }
      System.out.println("Final");
      new RemoveDuplicatesFromSortedList2_1().print(new RemoveDuplicatesFromSortedList2_1().deleteDuplicates(p));
   }
}
