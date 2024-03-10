package LinkedList.DoublyLinkedList;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int d){
        data = d;
        next = prev = null;
    }
}

public class InsertAtBeginning {
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

        head = InsertB(head, 5);
        Print(head);
    }

    public static Node InsertB(Node head, int x){

        Node temp = new Node(x);

        if(head == null){
            return temp;
        }

        temp.next = head;
        head.prev = temp;

        return temp;
    }

    public static void Print(Node head){

        if(head == null){
            System.out.print("null");
            return;
        }

        System.out.print(head.data + " -> ");

        Print(head.next);
    }
}
