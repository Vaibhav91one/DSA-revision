package Hashing;

import java.util.HashSet;

public class PairWithGivenSum_rev2 {
    public static void main(String[] args){
        int[] arr = {3, 2, 8, 15, -8};
        int n = arr.length;
        int sum = 17;

        PrintPair(arr, n , sum);
    }

    public static void PrintPair(int[] arr, int n, int sum){
        HashSet<Integer> hset = new HashSet<>();

        for(int i = 0; i < n; i++){
            if(hset.contains(sum - arr[i])){
                System.out.println(arr[i] + " " + (sum-arr[i]));
            }
            else{
                hset.add(arr[i]);
            }
        }
    }
}

