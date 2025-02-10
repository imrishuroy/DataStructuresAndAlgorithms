package linkedlist.FAQMedium;


import java.math.BigInteger;
import java.util.Stack;

// Definition of singly linked list
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

public class AddOne {

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creation of Linked List

        int[] nums = {4,8,4,9,2,9,2,1,9,1,2,4,8,8,0,7,3,0,5,3,6,4,0,5,6,5,2,9,8,2,4,4,3,8,9,3,9,6,4,6,8,7,8,0,3,8};
        ListNode head = new ListNode(nums[0]);
        ListNode temp = head;

        for (int i = 1; i < nums.length; i++) {
            temp.next = new ListNode(nums[i]);
            temp = temp.next;
        }

        printList(head);


//        head1.next = new ListNode(2);
//        head1.next.next = new ListNode(3);
////        head1.next.next.next = new ListNode(0);

       ListNode node =  addOne(head);
       printList(node);


    }

    public static ListNode addOne(ListNode head) {

        if (head == null) {
            return head;
        }

        // Reverse the linked list
        ListNode reversed = reverse(head);

        // Add one to the reversed list
        ListNode temp = reversed;
        int carry = 1;
        while (temp != null) {
            int sum = temp.val + carry;
            temp.val = sum % 10;
            carry = sum / 10;
            if (temp.next == null && carry > 0) {
                temp.next = new ListNode(carry);
                carry = 0;
            }
            temp = temp.next;
        }

        // Reverse back to original order
        return reverse(reversed);

    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

}
