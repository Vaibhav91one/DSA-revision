package LinkedList.Advance;

import static LinkedList.Advance.ReverseALinkedList_rev2.Print;

public class DeleteALoop_rev2 {
    public static void main(String[] args){
        Node_random head = new Node_random(10);
        Node_random temp1 = new Node_random(20);
        Node_random temp2 = new Node_random(30);
        Node_random temp3 = new Node_random(40);
        Node_random temp4 = new Node_random(50);


        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = head;

        DetectAndDeleteLoop(head);
        Print(head);

    }

    public static void DetectAndDeleteLoop(Node_random head){

        Node_random slow = head;
        Node_random fast = head;

        while(fast !=null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }

        }

        if(slow != fast){
            return;
        }

        slow = head;

        // If the loop starts at the head itself
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
        } else {
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }


        fast.next = null;
    }

}
// (m+K) = n (y - 2x)
// (m+k) is a multiple of n where n is no of node in the loop , such as 20 = 5 x 4 means 20 is a multiple of 5
// This means if we assume n as 1, (m+k) = n * 1 => m+k is the length of the loop
// and to go to the second meeting point, for slow it is m nodes and for fast it is (m+k-k) => m nodes.