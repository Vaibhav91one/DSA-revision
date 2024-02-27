package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SubarrayWIthGivenSum {
    public static void main(String[] args){

        int[] arr = {5, 8, 6, 13, 3, -1};
        int n = arr.length;
        int sum = 22;

        System.out.println(Arrays.toString(SubarrayWithGivenSum(arr,n,sum)));

    }

    public static Object[] SubarrayWithGivenSum(int[] arr, int n, int sum){

        HashSet<Integer> h = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        int pre_sum = 0;

        for(int i = 0; i < n; i++){

            pre_sum += arr[i];

            if(h.contains(pre_sum-sum)){

                al.add(i);

                return al.toArray();
            }

            if(pre_sum == sum){

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
