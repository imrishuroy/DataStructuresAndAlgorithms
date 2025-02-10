package linkedlist.DLL;

public class DeleteTail {

    public ListNode deleteTail(ListNode head) {

        if(head == null || head.next == null){
            return null;
        }

        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }

        ListNode newTail = tail.prev;
        newTail.next = null;
        tail.prev = null;

        return head;

        // ListNode current = head;
        // while(current.next.next != null){
        //     current = current.next;
        // }
        // current.next = null;
        // return head;
    }
}
