package LinkedList;

public class FindNthNodeFromTheEndOfTheLinkedList_rev2 {
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

        System.out.println(ReturnNthNode(head, n));
    }

    public static int ReturnNthNode(Node head, int n){

        if(head == null){
            return 0;
        }

        Node First = head;
        Node Second = head;

        for(int i = 0; i < n; i++){
            if(First == null){
                return 0;
            }
            First = First.next;
        }

        while(First != null){
            First = First.next;
            Second = Second.next;
        }

        return Second.data;
    }
}
