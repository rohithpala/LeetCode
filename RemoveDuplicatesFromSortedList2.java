// public class RemoveDuplicatesFromSortedList2 {
//    public void print(ListNode head) {
//       while (head != null) {
//          System.out.println(head.val);
//          head = head.next;
//       }
//    }

//    public ListNode deleteDuplicates(ListNode head) {
//       if (head == null || head.next == null)
//          return head;
//       if (head.next.next == null) {
//          if (head.val == head.next.val) {
//             return null;
//          } else {
//             return head;
//          }
//       }
//       ListNode q = head, temp = q.next;
//       while (q != null && q.next != null && q.next.next != null) {
//          temp = q.next;
//          if (temp.next == null) {
//             q = null;
//          } else {
//             if (temp.val == temp.next.val) {
//                while (temp.next != null && temp.val == temp.next.val) {
//                   temp = temp.next;
//                }
//                if (q.val == temp.val) {
//                   head = temp.next;
//                   q = head;
//                } else {
//                   q.next = temp.next;
//                }
//             } else {
//                if (q.val == temp.val) {
//                   head = temp.next;
//                   q = head;
//                } else {
//                   q = q.next;
//                }
//             }
//          }
//       }
//       return head;
//    }

//    public static void main(String[] args) {
//       // ListNode p = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2,
//       // new ListNode(3, null)))));
//       // ListNode p = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3,
//       // new ListNode(4, new ListNode(4, new ListNode(5, null)))))));
//       // ListNode p = new ListNode(1, new ListNode(1, null));
//       // ListNode p = new ListNode(1, new ListNode(2, new ListNode(2, null)));
//       ListNode p = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, null))));
//       System.out.println("Final");
//       new RemoveDuplicatesFromSortedList2().print(new RemoveDuplicatesFromSortedList2().deleteDuplicates(p));
//    }
// }
