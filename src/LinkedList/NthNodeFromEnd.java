package LinkedList;

public class NthNodeFromEnd {
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
        int n = 2;

        System.out.println(NthFromEnd(head, n));

    }

    public static int NthFromEnd(Node head, int n){

        Node First = head;
        Node Second = head;

        for(int i = 0; i < n; i++){
            Second = Second.next;
        }

        while(Second != null){
            First = First.next;
            Second = Second.next;
        }

        return First.data;
    }

}
