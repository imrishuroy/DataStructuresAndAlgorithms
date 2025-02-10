package linkedlist.DLL;

public class InsertBeforeHead {

    public ListNode insertBeforeHead(ListNode head, int X) {

        ListNode newHead = new ListNode(X, head, null);

        head.prev = newHead;

        return newHead;
    }
}
