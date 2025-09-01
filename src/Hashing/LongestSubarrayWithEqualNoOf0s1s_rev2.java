package Hashing;

import java.util.HashMap;

public class LongestSubarrayWithEqualNoOf0s1s_rev2 {
    public static void main(String[] args){
        int[] arr = {1, 0, 1, 1, 1, 0, 0};
        int n = arr.length;

        System.out.println(ReturnLongest(arr, n));
    }

    public static int ReturnLongest(int[] arr, int n){
        int prefix_sum = 0;
        int res = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(arr[i] ==0){
                arr[i] = -1;
            }
        }

        for(int i = 0; i < n; i++){

            prefix_sum += arr[i];

            if(prefix_sum == 0){
                res = i+1;
            }

            if(!hmap.containsKey(prefix_sum)){
                hmap.put(prefix_sum, i);
            }

            if(hmap.containsKey(prefix_sum)){
                res = Math.max(res, i - hmap.get(prefix_sum));
            }
        }

        return res;

    }
}
