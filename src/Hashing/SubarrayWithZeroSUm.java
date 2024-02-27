package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SubarrayWithZeroSUm {

    public static void main(String[] args){

    int[] arr = {13,-3,-10,5};
    int n = arr.length;
    int sum = 0;

    System.out.println(Arrays.toString(Subarray(arr,n,sum)));

    }

    public static Object[] Subarray(int[] arr, int n, int sum){

        HashSet<Integer> h = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        int pre_sum = 0;

        for(int i = 0; i < n; i++){

            pre_sum += arr[i];

            if(h.contains(pre_sum)){

                al.add(i);

                return al.toArray();
            }

            if(pre_sum == 0){

                al.add(0);
                al.add(i);

                return al.toArray();
            }

            h.add(pre_sum);

        }

        al.add(-1);

        return al.toArray();
    }

}
