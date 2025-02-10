package linkedlist.DLL;

public class InsertBeforeGivenNode {

    public void insertBeforeGivenNode(ListNode node, int X) {
        ListNode temp = new ListNode(X);

        ListNode prev = node.prev;
        temp.next = node;
        temp.prev = prev;

        prev.next = temp;
        node.prev = temp;

    }

}
