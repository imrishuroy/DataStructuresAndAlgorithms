package linkedlist.SLL;

public class InsertAtKthPosition {

    public ListNode insertAtKthPosition(ListNode head, int X, int K) {
        ListNode node = new ListNode(X);
        int count = 0;
        ListNode current = head;

        if(K == 1){
            node.next = head;
            return node;
        }

        while(current != null){
            count++;
            if(count == K - 1){
                node.next = current.next;
                current.next = node;
                break;
            }
            current = current.next;
        }

        return head;
    }


}
