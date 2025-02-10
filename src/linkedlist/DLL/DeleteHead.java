package linkedlist.DLL;

public class DeleteHead {

    public ListNode deleteHead(ListNode head) {
        if (head == null || head.next == null){
            return null;
        }

        ListNode prev = head;
        head = prev.next;
        head.prev = null;
        prev.next = null;

        return head;
    }
}


// Definition of doubly linked list:
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}
