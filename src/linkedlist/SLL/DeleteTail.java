package linkedlist.SLL;

public class DeleteTail {
    
    public ListNode deleteTail(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode current = head;
        // while(current != null){
        //     if(current.next.next == null){
        //         current.next = null;
        //     }
        //     current = current.next;
        // }
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        return head;
    }
}
