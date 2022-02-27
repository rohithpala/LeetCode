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
   ListNode newnode(int val) {
      return new ListNode(val, null);
   }

   ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      if (list1 == null && list2 == null) return null;
      else if (list1 == null) return list2;
      else if (list2 == null) return list1;

      ListNode mergedList;
      int fval = list1.val, sval = list2.val;
      if (fval <= sval) {
         mergedList = newnode(fval);
         list1 = list1.next;
      } else {
         mergedList = newnode(sval);
         list2 = list2.next;
      }

      while (list1 != null && list2 != null) {
         fval = list1.val;
         sval = list2.val;
         if (fval <= sval) {
            mergedList.next = newnode(fval);
            list1 = list1.next;
         } else {
            mergedList.next = newnode(sval);
            list2 = list2.next;
         }
      }

      while (list1 != null) {
         mergedList.next = newnode(list1.val);
         list1 = list1.next;
      }

      while (list2 != null) {
         mergedList.next = newnode(list2.val);
         list2 = list2.next;
      }

      return mergedList;
   }
}
