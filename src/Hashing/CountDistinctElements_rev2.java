package Hashing;

import java.util.HashSet;

public class CountDistinctElements_rev2 {
    public static void main(String[] args){
        int[] arr = {15, 12, 13, 12, 13, 13, 18};
        int n  = arr.length;

        System.out.println(ReturnCountDistinctElements(arr ,n));

    }

    public static int ReturnCountDistinctElements(int[] arr, int n){
        HashSet<Integer> hset  = new HashSet<>();

        for(int i = 0; i < n; i++){
            hset.add(arr[i]);
        }

        return hset.size();
    }
}
