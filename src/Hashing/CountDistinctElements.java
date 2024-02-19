package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class CountDistinctElements {
    public static void main (String[] args){
        int[] arr = {1,1,2,2,3,4,5,5};
        int n = 8;

        System.out.println(Distinct(arr,n));
    }

    public static int Distinct(int[] arr, int n){
        HashSet<Integer> h = new HashSet<>();

        for(int i = 0; i < n; i++){
            h.add(arr[i]);
        }

        Iterator<Integer> i = h.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
        
        return h.size();
    }
}
