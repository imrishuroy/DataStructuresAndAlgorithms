package linkedlist.SLL;

public class LinkedList{

   public static Node arrayToLinkedLit(int[] arr){
        int size = arr.length;
        if (size == 0) return null;

        // create head of the linked list
        Node head = new Node(arr[0]);
        Node current = head;

        /* Iterate through the array
        and create linked list nodes */
        for(int i = 1; i < size; i++){
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }

    public static void printLinkedList(Node head){
        Node current = head;
        while (current != null){
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = arrayToLinkedLit(arr);
        printLinkedList(head);

    }

}

class Node {
    int data;
    Node next;

    Node(int val){
        data = val;
        next = null;
    }
}
