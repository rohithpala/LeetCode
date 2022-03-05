// https://leetcode.com/problems/merge-two-sorted-lists/

class ListNode {
   int val;
   ListNode next;

   ListNode() {
   }

   ListNode(int val) {
      this.val = val;
   }

   ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
   }
}

public class MergeTwoSortedLists {
   static ListNode newnode(int val) {
      return new ListNode(val, null);
   }

   static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      if (list1 == null && list2 == null)
         return null;
      else if (list1 == null)
         return list2;
      else if (list2 == null)
         return list1;

      ListNode mergedList, q;
      int fval = list1.val, sval = list2.val;
      if (fval <= sval) {
         mergedList = newnode(fval);
         list1 = list1.next;
      } else {
         mergedList = newnode(sval);
         list2 = list2.next;
      }
      q = mergedList;

      while (list1 != null && list2 != null) {
         fval = list1.val;
         sval = list2.val;
         if (fval <= sval) {
            q.next = newnode(fval);
            list1 = list1.next;
         } else {
            q.next = newnode(sval);
            list2 = list2.next;
         }
         q = q.next;
      }

      while (list1 != null) {
         q.next = newnode(list1.val);
         list1 = list1.next;
         q = q.next;
      }

      while (list2 != null) {
         q.next = newnode(list2.val);
         list2 = list2.next;
         q = q.next;
      }

      return mergedList;
   }

   public static void main(String[] args) {
      ListNode l1 = newnode(1);
      l1.next = newnode(2);
      l1.next.next = newnode(4);

      ListNode l2 = newnode(1);
      l2.next = newnode(3);
      l2.next.next = newnode(4);

      ListNode ml = mergeTwoLists(l1, l2);
      System.out.print("Merged List: ");
      while (ml != null) {
         System.out.print(ml.val + " ");
         ml = ml.next;
      }
   }
}
