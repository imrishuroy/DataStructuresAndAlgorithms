package linkedlist.DLL;

public class InsertBeforeTail {

    public ListNode insertBeforeTail(ListNode head, int X) {
        ListNode node = new ListNode(X);

        if (head.next == null) {
            node.next = head;
            head.prev = node;
            return node;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }


        ListNode prev = current.prev;
        node.next = current;
        node.prev = prev;

        prev.next = node;
        current.prev = node;

        return head;
    }
}
