package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequenciesOfArrayElements {
    public static void main (String[] args){
        int[] arr = {1,1,2,2,3,4,5,5};
        int n = 8;

        Frequencies(arr, n);
    }

    public static void Frequencies(int[] arr, int n){
        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i = 0; i < n; i++){
            h.put(arr[i], h.getOrDefault(arr[i] , 0) + 1);
        }

        for(Map.Entry<Integer, Integer> e: h.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}
