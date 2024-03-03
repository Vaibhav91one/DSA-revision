package LinkedList;

class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
public class InsertAtEnd {

    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.next = temp2;

        head = InsertEnd(head, 40);
        Recursive(head);
    }

    public static Node InsertEnd(Node head, int x){

        Node curr = head;
        Node temp = new Node(x);

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = temp;

        return head;

    }

    public static void Recursive(Node head){
        if(head == null) {
            System.out.print("null");
            return;
        }

        System.out.print(head.data + " -> ");

        Recursive(head.next);
    }
}
