package linkedlist.SLL;

public class InsertBeforeValueX {

    public ListNode insertBeforeX(ListNode head, int X, int val) {
        ListNode node = new ListNode(val);

        if(head == null){
            return node;
        }

        if(head.val == X){
            node.next = head;
            return node;
        }

        ListNode current = head;

        while(current.next != null){
            if(current.next.val == X){
                node.next = current.next;
                current.next = node;
                break;
            }
            current = current.next;
        }
        return head;

    }
}
