package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class countDistinctElementsInAWindow {
    public static void main(String[] args){

        int[] arr = {10, 20, 20, 10, 30, 40, 10};
        int k = 4;
        int n = arr.length;

        DistinctElementWindow(arr, n, k);

    }

    public static void DistinctElementWindow(int[] arr, int n, int k){

        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i = 0;i < k; i++){
            h.put(arr[i], h.getOrDefault(arr[i], 0)+1);
        }

        System.out.println(h.size());

        for(int i = k; i < n; i++){

            h.put(arr[i-k], h.get(arr[i-k])-1);

            if(h.get(arr[i-k]) <= 0){
                h.remove(arr[i-k]);
            }

            h.put(arr[i], h.getOrDefault(arr[i], 0)+1);

            System.out.println(h.size());
        }

    }

}
