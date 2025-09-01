package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfArrayElements_rev2 {
    public static void main(String [] args){
        int[] arr = {10, 12, 10, 15, 10, 20, 12, 12};
        int n = arr.length;

        PrintElementFrequency(arr, n);
    }

    public static void PrintElementFrequency(int[] arr, int n){
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i], hmap.get(arr[i]) + 1);
            }
            else{
                hmap.put(arr[i], 1);
            }
        }

       hmap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
