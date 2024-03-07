package LinkedList.CircularList;

public class InsertAtBeginning {
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

        head = InsertBeginning(head, 5);
        Traversal(head);
    }

    public static Node InsertBeginning(Node head, int x){

        Node temp = new Node(x);
        Node curr = head;

        if( head == null){
            temp.next = temp;
            return temp;
        }

        else {
           temp.next = head.next;
           head.next = temp;

           int temp1 = head.data;
           head.data = temp.data;
           temp.data = temp1;
        }

        return head;

    }

    public static void Traversal(Node head){

        Node curr = head;

        do{
            System.out.print(curr.data + " => ");
            curr = curr.next;
        }while(curr != head);

        System.out.println(head.data);
    }
}
