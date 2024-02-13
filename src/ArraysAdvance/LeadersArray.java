package ArraysAdvance;

import java.util.ArrayList;

public class LeadersArray {
    public static void main(String[] args){
        int[] arr = {7,10,9,3,6,5,2};
        int n = arr.length;

        System.out.println(Leaders(arr,n));
    }

    public static String Leaders(int[] arr, int n){
        ArrayList<Integer> res = new ArrayList<>();

        int max = arr[n-1];
        res.add(max);

        for(int i = n-2; i>=0; i--){
            if(arr[i] > max){
                max = arr[i];
                res.add(arr[i]);
            }
        }

        return res.toString();
    }
}
