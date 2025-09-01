package LinkedList;

import static LinkedList.InsertAtEnd.Recursive;

public class RemoveDuplicateElements_rev2 {

    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(10);
        Node temp2 = new Node(10);
        Node temp3 = new Node(20);
        Node temp4 = new Node(30);


        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;

        Duplicate(head);

        Recursive(head);
    }


    public static void Duplicate(Node head){

        if (head == null) return;

        Node curr = head;

        while(curr !=null && curr.next !=null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }

    }

}
