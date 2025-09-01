package LinkedList.CircularList;

import static LinkedList.CircularList.InsertAtBeginning.Traversal;

public class DeleteKthNode_rev2 {
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

        int k = 1;

        Traversal(head);
        head = DeleteKth(head, k);
        Traversal(head);
    }

    public static Node DeleteKth(Node head, int k){

        if(head == null) return null;

        if(k == 1){
            head.data = head.next.data;
            head.next = head.next.next;
            return head;
        }

        Node curr = head;

        for(int i = 0; i < k-2; i ++){
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}
