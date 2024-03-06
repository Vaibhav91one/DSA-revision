package LinkedList;

public class InsertAtGivenPosition {
    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.next = temp2;

        head = Insert(head, 3, 25);

        Recursive(head);
    }

    public static Node Insert(Node head, int position, int x){

        Node curr = head;
        int index = 0;
        Node temp = new Node(x);

        while(curr != null){
            if(index == position - 2){
                break;
            }
            curr = curr.next;
            index++;
        }

        temp.next = curr.next;
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
