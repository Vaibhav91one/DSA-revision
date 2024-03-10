package LinkedList.DoublyLinkedList;

import static LinkedList.DoublyLinkedList.InsertAtBeginning.Print;

public class DeleteEnd {
    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        Node temp4 = new Node(50);

        head.next = temp1;
        head.prev = null;
        temp1.next = temp2;
        temp1.prev = head;
        temp2.next = temp3;
        temp2.prev = temp1;
        temp3.next = temp4;
        temp3.prev = temp2;
        temp4.prev = temp3;

        head = DeleteE(head);
        Print(head);
    }

    public static Node DeleteE(Node head){

        Node curr = head;

        if(head == null || head.next == null){
            return head;
        }

        while(curr.next != null){
            curr = curr.next;
        }

        curr.prev.next = null;


        return head;

    }
}
