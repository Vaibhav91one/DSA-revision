package LinkedList;

import static LinkedList.InsertAtEnd.Recursive;

public class ReverseLinkedList {
    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        Node temp4 = new Node(50);


        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;

        head = Reverse(head);

        Recursive(head);

    }

    public static Node Reverse(Node head){

        Node curr = head;
        Node prev = null;

        while(curr.next != null){

            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        curr.next = prev;

        return curr;
    }
}
