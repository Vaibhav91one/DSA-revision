package LinkedList;

import static LinkedList.InsertAtGivenPosition.Recursive;

public class ReverseALinkedList_rev2 {
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

        head = ReverseLinkedList(head);

        System.out.println(head.data);

        Recursive(head);

    }

    public static Node ReverseLinkedList (Node head){

        if (head == null) return null;

        if(head.next == null) return head;

        Node prev = null;
        Node curr = head;

        while(curr.next != null){

            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        curr.next = prev; // for the last node


        return curr;
    }

}
