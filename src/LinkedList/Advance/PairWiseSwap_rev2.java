package LinkedList.Advance;

import static LinkedList.Advance.ReverseALinkedList_rev2.Print;

public class PairWiseSwap_rev2 {
    public static void main(String [] args){
        Node_random head = new Node_random(10);
        Node_random temp1 = new Node_random(20);
        Node_random temp2 = new Node_random(30);
        Node_random temp3 = new Node_random(40);
        Node_random temp4 = new Node_random(50);


        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;

//        Print(head);
//        head = PairWiseSwap(head);
//        Print(head);

        Print(head);
        head = PairWiseSwap_LinkChange(head);
        Print(head);
    }

    public static Node_random PairWiseSwap(Node_random head){
        int k = 2;
        Node_random prevFirst = null;
        Node_random curr = head;
        Boolean isFirstpass = true;

        while(curr != null){
            Node_random first = curr;
            Node_random next = null;
            Node_random prev = null;
            int count = 0;

            while(curr !=null && count < k){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }

            if(isFirstpass){
                head = prev;
                isFirstpass = false;
            }
            else{
                prevFirst.next = prev;
            }
                prevFirst = first;
        }

        return head;
    }

    public static Node_random PairWiseSwap_LinkChange(Node_random head){
        if (head == null || head.next == null) return head;

        Node_random curr = head.next.next;
        Node_random prev = head;
        head = head.next;
        head.next = prev;

        while (curr != null && curr.next !=null){
            prev.next = curr.next;
            prev = curr;
            Node_random next = curr.next.next;
            curr.next.next = curr;
            curr = next;
        }

        prev.next = curr;

        return head;
    }
}
