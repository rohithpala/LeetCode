// https://leetcode.com/problems/add-two-numbers/

public class AddTwoNumbers {
    static int[] divide(int n) {
        int[] sumResult = new int[2];
        if (n > 9) {
            sumResult[0] = n % 10;
            sumResult[1] = n / 10;
        } else {
            sumResult[0] = n;
            sumResult[1] = 0;
        }
        return sumResult;
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1, second = l2, result, q;
        int carry, rem;
        int[] sumResult;
        sumResult = divide(first.val + second.val);
        rem = sumResult[0];
        carry = sumResult[1];
        result = new ListNode(rem, null);
        q = result;
        first = first.next;
        second = second.next;
        while (first != null && second != null) {
            sumResult = divide(first.val + second.val + carry);
            rem = sumResult[0];
            carry = sumResult[1];
            System.out.println("REM:" + rem + "Carry:" + carry);
            q.next = new ListNode(rem, null);
            first = first.next;
            second = second.next;
            q = q.next;
        }

        while (first != null) {
            sumResult = divide(first.val + carry);
            rem = sumResult[0];
            carry = sumResult[1];
            System.out.println("REM1:" + rem + "Carry1:" + carry);
            q.next = new ListNode(rem, null);
            q = q.next;
            first = first.next;
        }

        while (second != null) {
            sumResult = divide(second.val + carry);
            rem = sumResult[0];
            carry = sumResult[1];
            System.out.println("REM2:" + rem + "Carry2:" + carry);
            q.next = new ListNode(rem, null);
            q = q.next;
            second = second.next;
        }

        System.out.println(carry);
        if (carry == 1) q.next = new ListNode(1, null);

        q = result;
        System.out.println("\nResult In");
        while (q != null) {
            System.out.println(q.val);
            q = q.next;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode q, l1 = new ListNode(9, null);
        ListNode l2 = new ListNode(9, null);
        int i;
        q = l1;
        for(i = 0 ; i < 6 ; i++) {
            q.next = new ListNode(9, null);
            q = q.next;
        }
        q = l2;
        for(i = 0 ; i < 3 ; i++) {
            q.next = new ListNode(9, null);
            q = q.next;
        }
        // ListNode q, l1 = new ListNode(2, null);
        // ListNode l2 = new ListNode(5, null);
        // q = l1;
        // q.next = new ListNode(4, null);
        // q.next.next = new ListNode(3, null);
        // q = l2;
        // q.next = new ListNode(6, null);
        // q.next.next = new ListNode(4, null);
        ListNode res = addTwoNumbers(l1, l2);
        System.out.println("\nResult");
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
