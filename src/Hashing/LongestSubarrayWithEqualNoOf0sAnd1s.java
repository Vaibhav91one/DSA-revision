package Hashing;

import java.util.HashMap;

public class LongestSubarrayWithEqualNoOf0sAnd1s {
    public static void main(String[] args){

        int[] arr = {1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0};
        int n = arr.length;

        System.out.println(Longest(arr, n));

    }

    public static int Longest(int[] arr, int n){

        HashMap<Integer, Integer> h = new HashMap<>();
        int res = 0;
        int prefix_sum = 0;

        for(int i = 0; i < n ; i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }

        for(int i = 0; i < n; i++){

            prefix_sum += arr[i];

            if(prefix_sum == 0){
                res = i+1;
            }

            if(!h.containsKey(prefix_sum)){
                h.put(prefix_sum, i);
            }

            if(h.containsKey(prefix_sum)){
                res = Math.max(res, i - h.get(prefix_sum));
            }

        }

        return res;
    }
}
