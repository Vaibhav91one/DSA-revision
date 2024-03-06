package LinkedList;

import static LinkedList.InsertAtEnd.Recursive;

public class SortedInsertion {
    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.next = temp2;

        head = SortInsert(head, 32);

        Recursive(head);
    }

    public static Node SortInsert(Node head, int x){

        Node curr = head;
        Node temp = new Node(x);

        if( head == null){
            return temp;
        }

        while(curr != null && curr.next != null){

            if(curr.data <= x && curr.next.data >= x){
                break;
            }

            curr = curr.next;

        }


        temp.next = curr.next;
        curr.next = temp;

        return head;
    }

}
