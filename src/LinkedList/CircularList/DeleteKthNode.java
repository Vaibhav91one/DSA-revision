package LinkedList.CircularList;

import static LinkedList.CircularList.InsertAtBeginning.Traversal;

public class DeleteKthNode {
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

        int k = 3;

        head = RemoveKNode(head, k);
        Traversal(head);
    }

    public static Node RemoveKNode(Node head, int k){

        int index = 0;
        Node curr = head;

        if(head == null || head.next == null){
            return null;
        }

        else{

            while(index != k - 2){
                curr = curr.next;
                index++;
            }

            curr.next = curr.next.next;
        }

        return head;

    }
}
