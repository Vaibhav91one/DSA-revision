package LinkedList.DoublyLinkedList;

import static LinkedList.DoublyLinkedList.InsertAtBeginning.Print;

public class ReverseDoublyLinkedList_rev2 {
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

        head = ReverseDoubly(head);

        Print(head);
    }

    public static Node ReverseDoubly(Node head){
        if (head == null || head.next == null) return head;

        Node prev = null;
        Node curr =head;

        while(curr !=null){
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }

        return prev.prev;
    }
}

// null 10 20 30 40 50 null
// prev = null, curr = 20 | 20 10 null
// prev = 10, curr = 30 | 30 20 10 null
// prev = 20, curr = 40 | 40 30 20 10 null
// prev = 30, curr = 50 | 50 40 30 20 10 null
// prev = 40, curr = null | null 50 40 30 20 10 null
