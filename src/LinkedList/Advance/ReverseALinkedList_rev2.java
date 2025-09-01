package LinkedList.Advance;


public class ReverseALinkedList_rev2 {
    public static void main(String[] args){
        Node_random head = new Node_random(10);
        Node_random temp1 = new Node_random(20);
        Node_random temp2 = new Node_random(30);
        Node_random temp3 = new Node_random(40);
        Node_random temp4 = new Node_random(50);
int k = 3;

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = null;

        Print(head);
        head = ReverseKIterative(head,k);
        Print(head);

    }

    public static void Print(Node_random head){

        Node_random curr = head;

        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr  = curr.next;
        }
        System.out.println("NULL");
        System.out.println(" ");
    }


    public static Node_random ReverseKRecursive(Node_random head, int k){
        Node_random curr = head;
        int count = 0;
        Node_random prev = null;
        Node_random next = null;

        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count ++;
        }

        if(next != null){
            Node_random rest_head = ReverseKRecursive(next, k);
            head.next = rest_head;
        }

        return prev;
    }

    public static Node_random ReverseKIterative(Node_random head, int k){
        Node_random curr = head;
        Node_random prevFirst = null;
        Boolean isFirstPass = true;

        while(curr != null){
            Node_random first = curr;

            Node_random prev = null;
            Node_random next = null;
            int count = 0;


        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count ++;
        }

        if(isFirstPass){
            head = prev;
            isFirstPass = false;
        }
        else{
            prevFirst.next = prev;
        }
        prevFirst = first;
        }
        return head;
    }
}
