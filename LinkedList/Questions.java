/*
  LC: 142. Linked List Cycle II

  Difficulty: Medium

  Pattern: Linked List + Two Pointers

  public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
*/

/*
  LC: 25. Reverse Nodes in k-Group

  Difficulty: Hard

  Pattern: Linked List + Recursion

  class Solution {
    public ListNode reverseKGroup(ListNode head, int k){

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroup = dummy;
        while (prevGroup.next != null) {
            ListNode first = prevGroup.next;
            ListNode temp = first;

            for (int i = 1; i < k; i++){
                temp = temp.next;
                if (temp == null){
                    return dummy.next;
                }
            }

            ListNode nextGroup = temp.next;
            ListNode prev = nextGroup;
            ListNode current = first;

            for (int i = 0; i < k; i++){
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            prevGroup.next = temp;            
            prevGroup = first;
        }
        return dummy.next;
    }
}
*/

/*
  LC: 143.Reorder List

  Difficulty: Medium

  Pattern: Linked List + Two Pointers

  class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode current = slow;

        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode first = head;
        ListNode second = prev;

        while(second.next != null){
            ListNode FirstText = first.next;
            ListNode SecondText = second.next;

            first.next = second;
            second.next = FirstText;
            first = FirstText;
            second = SecondText;
        } 
    }
}
*/