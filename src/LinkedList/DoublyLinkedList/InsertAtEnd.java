package LinkedList.DoublyLinkedList;

import static LinkedList.DoublyLinkedList.InsertAtBeginning.Print;

public class InsertAtEnd {
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

       head = InsertE(head, 5);
        Print(head);
    }

    public static Node InsertE(Node head, int x){

        Node temp = new Node(x);
        Node curr = head;

        if(head == null){
            return temp;
        }

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = temp;
        temp.prev = curr;

        return head;
    }

}
