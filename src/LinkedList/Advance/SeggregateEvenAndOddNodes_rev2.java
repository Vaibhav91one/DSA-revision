package LinkedList.Advance;

import static LinkedList.Advance.ReverseALinkedList_rev2.Print;

public class SeggregateEvenAndOddNodes_rev2 {
    public static void main(String[] args){
        Node_random head = new Node_random(1);
        Node_random temp1 = new Node_random(2);
        Node_random temp2 = new Node_random(3);
        Node_random temp3 = new Node_random(4);
        Node_random temp4 = new Node_random(5);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = null;

        Print(head);
        head = SeggregateEvenOddNodes(head);
        Print(head);

    }

    public static Node_random SeggregateEvenOddNodes(Node_random head){
        Node_random eS = null;
        Node_random eE = null;
        Node_random oS = null;
        Node_random oE = null;

        for (Node_random curr = head; curr !=null; curr = curr.next){

            int x = curr.data;

            if(x % 2 == 0){
                if (eS == null) {
                    eS = curr;
                    eE = eS;
                }
                else{
                    eE.next = curr;
                    eE = eE.next;
                }
            }
            else{
                    if (oS == null) {
                        oS = curr;
                        oE = oS;
                    }
                    else{
                        oE.next = curr;
                        oE = oE.next;
                    }
            }
        }

        // If there are no even numbers, return odd list
        if (eS == null) return oS;

        // If there are no odd numbers, return even list
        if (oS == null) return eS;

        // Connect even list to odd list
        eE.next = oS;
        oE.next = null; // End the odd list properly

        return eS; // Head of the modified list


    }

}
