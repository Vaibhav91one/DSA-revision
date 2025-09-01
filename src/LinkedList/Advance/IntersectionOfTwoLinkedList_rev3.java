package LinkedList.Advance;

import java.util.HashSet;

public class IntersectionOfTwoLinkedList_rev3 {
    public static void main(String[] args){
        Node_random head = new Node_random(10);
        Node_random temp1 = new Node_random(20);
        Node_random temp2 = new Node_random(30);
        Node_random temp3 = new Node_random(40);
        Node_random temp4 = new Node_random(50);
        Node_random temp5 = new Node_random(35);


        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;

        temp5.next = temp3;

        System.out.println(ReturnIntersection(head, temp5));
        System.out.println(ReturnWithTwoPointerApproch(head, temp5));
    }

    public static Integer ReturnIntersection(Node_random h1, Node_random h2){

        HashSet<Integer> hset = new HashSet<>();

        Node_random curr1 = h1;
        Node_random curr2 = h2;

        while(curr1!=null){
            hset.add(curr1.data);
            curr1 = curr1.next;
        }

        while(curr2!=null){

            if(hset.contains(curr2.data)){
                return curr2.data;
            }

            curr2 = curr2.next;

        }

        return null;
    }

    public static Integer ReturnWithTwoPointerApproch(Node_random h1, Node_random h2){

        Node_random a = h1;
        Node_random b = h2;

        while(a != b){
            a = (a == null) ? h2 : a.next;
            b = (b == null) ? h1 : b.next;
        }

        return a.data;
    }

}
