package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubarrayWithGivenSum_rev2 {
    public static void main (String[] args){
        int[] arr = {5, 8, -4, -4, 9, -2, 2};
        int n = arr.length;
        int sum = 0;

        System.out.println(ReturnLongestSubarray(arr, n , sum));
    }

    public static int ReturnLongestSubarray(int[] arr, int n, int sum){
        int prefix_sum = 0;
        int res = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i = 0; i < n; i++){
            prefix_sum += arr[i];

            if(prefix_sum == sum){
                res = i+1;           // +1 because we are calculating length
            }

            if(!hmap.containsKey(prefix_sum)){
                hmap.put(prefix_sum, i);
            }

            if(hmap.containsKey(prefix_sum - sum)){
                res = Math.max(res, i - hmap.get(prefix_sum - sum));
            }
        }

        return res;
    }
}
