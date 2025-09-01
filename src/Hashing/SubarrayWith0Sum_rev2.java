package Hashing;

import java.util.HashSet;

public class SubarrayWith0Sum_rev2 {
    public static void main(String[] args){
//        int[] arr = {1, 4, 13, -3, -10, 5};
        int [] arr = {5, 8, 6, 13, 3, -1};
        int n = arr.length;
//        int sum = 0;
        int sum = 22;

        System.out.println(ReturnSubarrayPresent(arr, n, sum));
    }

    public static boolean ReturnSubarrayPresent(int[] arr, int n, int sum){
        int prefix_sum = 0;
        HashSet<Integer> hset = new HashSet<>();

        for(int i = 0; i < n; i++){

            prefix_sum += arr[i];

            if(hset.contains(prefix_sum - sum)){
                return true;
            }

            if(prefix_sum == sum){
                return true;
            }

            hset.add(prefix_sum);
        }

        return false;

    }
}
