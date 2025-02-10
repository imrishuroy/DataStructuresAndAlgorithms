package linkedlist.DLL;

public class InsertNodeBeforeKthNode {

    public ListNode insertBeforeKthPosition(ListNode head, int X, int K) {
        ListNode node = new ListNode(X);

        if(K == 1){
            node.next = head;
            head.prev = node;
            return node;
        }

        int count = 0;
        ListNode current = head;
        while(current.next != null){
            count++;
            if(count == K){
                break;
            }
            current = current.next;
        }

        ListNode prev = current.prev;
        node.prev = prev;
        node.next = current;

        prev.next = node;
        current.prev = node;

        return head;
    }
}
