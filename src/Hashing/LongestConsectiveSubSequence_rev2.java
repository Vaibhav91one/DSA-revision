package Hashing;

import java.util.HashSet;

public class LongestConsectiveSubSequence_rev2 {
    public static void main(String[] args){
        int[] arr = {1,9, 3, 4, 2, 20};
        int n = arr.length;

        System.out.println(ReturnLength(arr, n));
    }

    public static int ReturnLength(int[] arr, int n){
        int res = 0;
        int curr = 1;
        HashSet<Integer> hset = new HashSet<>();

        for(int i = 0; i < n; i++){
            hset.add(arr[i]);
        }

        for(int i = 0; i < n; i++){
            if(!hset.contains(arr[i]-1)){
                curr = 1;
                while(hset.contains(arr[i]+curr)){
                    curr++;
                }
            }
            res = Math.max(res, curr);
        }

        return res;
    }
}
