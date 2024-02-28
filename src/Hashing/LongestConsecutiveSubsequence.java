package Hashing;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args){

        int[] arr= {1,9,3,4,2,20};
        int n = arr.length;

        System.out.println(LongestConsecutive(arr, n));

    }

    public static int LongestConsecutive(int[] arr, int n){

        HashSet<Integer> h = new HashSet<>();
        int res = 0;
        int curr = 0;

        for(int i = 0; i < n;i++){
            h.add(arr[i]);
        }

        for(int i = 0; i < n; i++){

            if(!h.contains(arr[i]-1)){
                curr = 1;

                while(h.contains(arr[i]+curr)){
                    curr++;
                }

                res = Math.max(res, curr);
            }

        }

        return res;
    }
}
