package ArraysAdvance;

import java.util.ArrayList;

public class LeadersArray_rev2 {
    public static void main(String[]args){
        int[] arr = {7,10,9,3,6,5,2};
        int n = arr.length;

        System.out.println(Leaders(arr,n));
    }

    public static String Leaders(int[] arr, int n){

        ArrayList<Integer> res = new ArrayList<>();

        int currentLeader = arr[n-1];
        res.add(currentLeader);

        for(int i = n-2; i > 0; i--){
            if(arr[i] > currentLeader){
                currentLeader = arr[i];
                res.add(currentLeader);
            }
        }

        return res.toString();
    }
}
