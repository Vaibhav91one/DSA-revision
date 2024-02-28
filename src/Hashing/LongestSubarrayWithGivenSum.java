package Hashing;

import java.util.HashMap;

public class LongestSubarrayWithGivenSum {
    public static void main(String[] args){

        int[] arr = {6, 13, 3, -1};
        int n = arr.length;
        int sum = 22;

        System.out.println(Longest(arr, n, sum));

    }

    public static int Longest(int[] arr, int n, int sum){

        HashMap<Integer, Integer> h = new HashMap<>();
        int res = 0;
        int prefix_sum = 0;

        for(int i = 0; i < n; i++){

            prefix_sum += arr[i];

            if(prefix_sum == sum){
                res = i+1;
            }

            if(h.containsKey(prefix_sum - sum)){
                res = Math.max(res, i - h.get(prefix_sum-sum));
            }

            if(!h.containsKey(prefix_sum)){
                h.put(prefix_sum, i);
            }



        }

        return res;
    }

}
