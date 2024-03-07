package LinkedList.CircularList;

import static LinkedList.CircularList.InsertAtBeginning.Traversal;

public class DeleteHead {
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
        temp4.next = head;

        head = RemoveHead(head);
        Traversal(head);
    }

    public static Node RemoveHead(Node head){

        if(head == null || head.next == null){
            return null;
        }

        else{
            int temp1 = head.data;
            head.data = head.next.data;
            head.next.data = temp1;

            head.next = head.next.next;
        }

        return head;

    }
}
