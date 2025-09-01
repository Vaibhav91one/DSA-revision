package Hashing;

import java.util.HashMap;

public class CountDistinctElementsEveryWindow_rev2 {
    public static void main(String[] args){
        int[] arr = {10, 20 , 20 , 10, 30, 40, 10};
        int n = arr.length;
        int k = 4;


        ReturnFrequencyEveryWindow(arr, n, k);

    }

    public static void ReturnFrequencyEveryWindow(int[] arr, int n, int k){
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i = 0; i < k; i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i], hmap.get(arr[i]) + 1);
            }
            else{
                hmap.put(arr[i], 1);
            }
        }

        System.out.println(hmap.size());

        for(int j = k; j < n; j++){
            hmap.put(arr[j-k], hmap.get(arr[j-k]) - 1);

            if(hmap.get(arr[j-k])==0){
                hmap.remove(arr[j-k]);
            }

            if(hmap.containsKey(arr[j])){
                hmap.put(arr[j], hmap.get(arr[j]) + 1);
            }
            else{
                hmap.put(arr[j], 1);
            }

            System.out.println(hmap.size());

        }


    }
}
