package LinkedList;

public class InsertAtBeginning {

    class Node{

        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }

    }

    public void main(String[] args){

        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.next = temp2;

        head = Insert(head, 5);
    }

    public Node Insert(Node head, int x){

        Node temp = new Node(x);
        temp.next = head;

        return temp;
    }

}

