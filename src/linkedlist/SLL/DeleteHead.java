package linkedlist.SLL;

public class DeleteHead {

    public ListNode deleteHead(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode temp = head;
        head = temp.next;
        return head;
    }
}
