package linkedlist.SLL;

public class DeleteKthElement {

    public ListNode deleteKthNode(ListNode head, int k) {
        if(head == null){
            return head;
        }
        if(k == 1){ // delete head
            return head.next;
        }

        ListNode current = head;
        ListNode prev = null;
        int count = 0;

        while(current != null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = current;
            current = current.next;
        }
        return head;
    }

}
