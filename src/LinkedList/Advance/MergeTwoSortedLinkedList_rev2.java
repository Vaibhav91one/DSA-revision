package LinkedList.Advance;


public class MergeTwoSortedLinkedList_rev2 {
    public static void main(String[] args) {
        // Sample Sorted Linked List 1: 1 → 3 → 5 → 7 → 9
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);
        head1.next.next.next = new Node(7);
        head1.next.next.next.next = new Node(9);

        // Sample Sorted Linked List 2: 2 → 4 → 6 → 8 → 10
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);
        head2.next.next.next.next = new Node(10);

        // Call your merging function here
        Node mergedHead = mergeSortedLists(head1, head2); // You need to implement this method

        // Print the merged linked list
        printLinkedList(mergedHead);
    }

    // Implement mergeSortedLists(Node head1, Node head2) method here

    public static Node mergeSortedLists(Node a, Node b){

        if (a == null) return b;
        if (b == null) return a;

        Node head = null;
        Node tail = null;

        if(a.data <= b.data){
            head = a;
            tail = a;
            a = a.next;
        }
        else{
            head = b;
            tail = b;
            b = b.next;
        }

        while(a != null && b != null){
            if(a.data <= b.data){
               tail.next = a;
                tail = a;
                a = a.next;
            }
            else{
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }

        if( a == null) tail.next = b;
        else tail.next = b;

        return head;
    }

    // Utility function to print a linked list
    public static void printLinkedList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " → ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
