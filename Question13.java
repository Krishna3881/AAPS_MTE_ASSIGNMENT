// KRISHNA KUMAR YADAV
// 22SCSE1410066
// QUESTION 13
// How to merge two sorted linked lists into one sorted list. Write its algorithm, program.
// Find its time and space complexities. Explain with suitable example.
// ANSWER
// Algorithm: Use a dummy node and merge by value.
// Time/Space: O(n + m)/O(1)
// Example: 1->3->5 and 2->4->6 → 1->2->3->4->5->6
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    }
public class Question13 {
    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0), curr = dummy;
        while (l1 != null && l2 != null) {
        if (l1.val < l2.val) { curr.next = l1; l1 = l1.next; }
        else { curr.next = l2; l2 = l2.next; }
        curr = curr.next;
        }
        curr.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = null;
        ListNode l3=merge(l1, l2);
        System.out.println(l3);
    }
}
