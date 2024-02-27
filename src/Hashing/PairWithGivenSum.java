package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PairWithGivenSum {
    public static void main(String[] args){

        int[] arr = {3,2,8,15,-8};
        int sum = 17;
        int n = arr.length;

        System.out.println(Arrays.toString(Pair(arr, n, sum)));

    }

    public static Object[] Pair(int[] arr, int n, int sum){
        HashSet<Integer> h = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < n; i++){


            if(h.contains(sum-arr[i])){
                al.add(arr[i]);

                al.add(sum-arr[i]);

                return al.toArray();
            }

            h.add(arr[i]);


        }

        al.add(-1);

        return al.toArray();
    }
}
