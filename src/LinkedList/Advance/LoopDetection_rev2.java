package LinkedList.Advance;

public class LoopDetection_rev2 {
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

        DetectLoop(head);

    }

    public static void DetectLoop(Node_random head){

        Node_random slow = head;
        Node_random fast = head;

        while(fast !=null && fast.next!=null){
            slow =slow.next;
            fast = fast.next.next;

            if(slow == fast){
                System.out.println("Cycle Detected");
                return;
            }

        }

    }
}
