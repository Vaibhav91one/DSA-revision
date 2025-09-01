package ArraysAdvance.PrefixSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxOccurenceInARange_rev_2 {
    public static void main(String[] args){
        int[] L = {1, 2, 5, 15};
        int[] R = {5, 8, 7, 18};

        int n = L.length;

        System.out.println(ReturnMaxOccuredElement(L, R, n));
    }

    public static int ReturnMaxOccuredElement(int[] L , int[] R, int n){

        int[] arr = new int[1000];

        Arrays.fill(arr, 0);

        for(int i = 0; i < n-1; i++){
            arr[L[i]]++;
            arr[R[i+1]]--; //balances the increase in staring point.
        }

        int max = arr[0];
        int res = 0;

        for(int i = 1; i < 1000; i++){
            arr[i] += arr[i-1];

            if( max < arr[i]){
                max = arr[i];
                res = i;
            }

        }

        return res;
    }
}
