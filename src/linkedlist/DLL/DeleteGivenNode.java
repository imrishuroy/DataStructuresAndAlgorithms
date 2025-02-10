package linkedlist.DLL;

public class DeleteGivenNode {

    public void deleteGivenNode(ListNode node) {

        ListNode prev = node.prev;
        ListNode front = node.next;

        if(front == null){
            prev.next = null;
            node.prev = null;
            return;
        }

        prev.next = front;
        front.prev = prev;

        node.next = null;
        node.prev = null;

    }
}
