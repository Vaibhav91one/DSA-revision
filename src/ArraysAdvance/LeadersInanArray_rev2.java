package ArraysAdvance;

import java.util.ArrayList;

public class LeadersInanArray_rev2 {
    public static void main(String [] args){
        int[] arr = {11, 2, 5, 10, 2};
        int n = arr.length;
        PrintLeaders(arr, n);
    }

    public static void PrintLeaders(int[] arr, int n){
        ArrayList<Integer> finalArr = new ArrayList<Integer>();
        int res = arr[n-1]; //curr leader
        finalArr.add(arr[n-1]);

        for(int i = n-2; i >= 0; i--){
            if(arr[i] > res){
                res = arr[i];
                finalArr.add(arr[i]);
            }
        }

        System.out.println(finalArr.toString());
    }
}
