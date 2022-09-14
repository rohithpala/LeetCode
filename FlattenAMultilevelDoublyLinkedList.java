import java.util.*;

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    Node(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
        this.child = null;
    }

    Node(int val, Node prev, Node next, Node child) {
        this.val = val;
        this.prev = prev;
        this.next = next;
        this.child = child;
    }
}

class Solution {
   public Node flatten(Node head) {
      if (head == null) return null;
      
      Node res = null;
      Node popped, tempRes = null, tempHead = head;
      Stack<Node> stack = new Stack<Node>();
      
      while (tempHead != null) {
          if (res == null) {
              res = new Node(tempHead.val);
              tempRes = res;
              if (tempHead.child == null)
                  tempHead = tempHead.next;
              else {
                  stack.push(tempHead);
                  tempHead = tempHead.child;
              }
          } else {
              tempRes.next = new Node(tempHead.val, tempRes, null, null);
              tempRes = tempRes.next;
              
              if (tempHead.child != null) {
                  stack.push(tempHead);
                  tempHead = tempHead.child;
              } else {
                  if (tempHead.next == null) {
                      if (stack.isEmpty()) {
                          break;
                      }
                      
                      popped = stack.pop();
                      while (popped.next == null) {
                          if (stack.isEmpty()) break;
                          popped = stack.pop();
                      }
                      
                      if (popped.next == null) break;
                      tempHead = popped.next;
                  } else {
                      if (tempHead.next == null) {
                          if (stack.isEmpty()) {
                              break;
                          } else {
                              tempHead = stack.pop().next;
                          }
                      }
                      tempHead = tempHead.next;
                  }
              }
          }
      }
      
      return res;
  }
}
