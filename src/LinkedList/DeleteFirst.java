package LinkedList;


public class DeleteFirst {
    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.next = temp2;

        head = DeleteEnd(head);
        Recursive(head);

        head = DeleteFirst(head);
        Recursive(head);

    }

    public static Node DeleteEnd(Node head){

        if(head == null) return null;

        if(head.next == null) return null;

        Node curr = head;

        while(curr.next.next != null){
            curr = curr.next;
        }

        curr.next = null;

        return head;
    }

    public static Node DeleteFirst(Node head){

        if(head == null) return null;

        if(head.next == null) return null;

        return head.next;
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
