package linkedlist.SLL;

public class InsertHead {

    public ListNode insertAtHead(ListNode head, int X) {
        ListNode newHead = new ListNode(X);
        newHead.next = head;
        return newHead;
    }
}
