package LinkedList.Advance;

import static LinkedList.Advance.ReverseALinkedList_rev2.Print;

class Node_random {
    int data;
    Node_random next, random;

    Node_random(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}

public class CloneALinkedList_rev2 {
    public static void main(String[] args) {
        // Creating a sample linked list with random pointers
        Node_random head = new Node_random(1);
        head.next = new Node_random(2);
        head.next.next = new Node_random(3);
        head.next.next.next = new Node_random(4);
        head.next.next.next.next = new Node_random(5);
        head.next.next.next.next.next = new Node_random(6);
        head.next.next.next.next.next.next = new Node_random(7);

        // Setting up random pointers
        head.random = head.next.next;  // 1 → 3
        head.next.random = head.next.next.next.next.next;  // 2 → 6
        head.next.next.random = head;  // 3 → 1
        head.next.next.next.random = head.next.next.next.next;  // 4 → 5
        head.next.next.next.next.random = head.next;  // 5 → 2
        head.next.next.next.next.next.random = head.next.next.next.next.next.next;  // 6 → 7
        head.next.next.next.next.next.next.random = head.next.next.next;  // 7 → 4

        // Call your cloning function here
        printLinkedList(head);
        System.out.println(" ");
        Node_random clonedHead = cloneLinkedList(head); // You need to implement this method
        printLinkedList(clonedHead);
    }
    // Utility function to print the linked list
    public static void printLinkedList(Node_random head) {
        Node_random curr = head;
        while (curr != null) {
            System.out.print("Node: " + curr.data);
            if (curr.random != null) {
                System.out.println(", Random points to: " + curr.random.data);
            } else {
                System.out.println(", Random points to: null");
            }
            curr = curr.next;
        }
    }
    // Implement cloneLinkedList(Node head) method here
    public static Node_random cloneLinkedList(Node_random head) {

        if (head == null || head.next == null || head.random == null){
            return head;
        }
        // going over the black nodes original one
        for(Node_random curr = head; curr !=null; curr=curr.next.next){
            Node_random next = curr.next;
            curr.next = new Node_random(curr.data);
            curr.next.next = next;
        }
        // going over the black nodes original one
        for (Node_random curr = head; curr != null; curr = curr.next.next) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
        }


        Node_random cloneHead = head.next;
        for(Node_random curr = head; curr !=null; curr=curr.next){
            Node_random clone = curr.next; // pointing to the original node from 2nd original node
            curr.next = clone.next; // pointing to the next original node.
            clone.next = (clone.next !=null) ? clone.next.next : null; // pointing clone to the next cloned node
        }


        return cloneHead;
    }
}




