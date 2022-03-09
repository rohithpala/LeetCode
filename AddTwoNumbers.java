// https://leetcode.com/problems/add-two-numbers/

public class AddTwoNumbers {
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1, second = l2, result, q;
        int carry = 0, s;
        result = new ListNode(first.val + second.val, null);
        q = result;
        first = first.next;
        second = second.next;
        while (first != null && second != null) {
            s = first.val + second.val + carry;
            carry = (int) (s / 10);
            q.next = new ListNode(s % 10 , null);
            first = first.next;
            second = second.next;
            q = q.next;
        }

        while (first != null) {
            q = new ListNode(first.val, null);
            q = q.next;
            first = first.next;
        }

        while (second != null) {
            q = new ListNode(second.val, null);
            q = q.next;
            second = second.next;
        }

        return result;
    }
}