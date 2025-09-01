package LinkedList;

public class MiddleOfTheLinkedList_rev2 {

    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
//        Node temp4 = new Node(50);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
//        temp3.next = temp4;

        System.out.println(Middle(head));
    }

    public static int Middle(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

}
