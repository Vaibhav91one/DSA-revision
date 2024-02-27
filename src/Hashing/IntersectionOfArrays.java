package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfArrays {
    public static void main(String[] args){

        int[] arr1 = {10, 15, 20, 15, 30, 30, 5};
        int[] arr2 = {30, 5, 30, 80};
        int n = arr1.length;
        int m = arr2.length;

        System.out.println(Arrays.toString(Intersection(arr1, arr2, n, m)));


    }

    public static Object[] Intersection(int[] arr1, int[] arr2, int n, int m){

        HashSet<Integer> h = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < m; i++){
            h.add(arr2[i]);
        }

        for(int i = 0; i < n; i++){
            if(h.contains(arr1[i])){
                arr.add(arr1[i]);
            }
            h.remove(arr1[i]);
        }

        return arr.toArray();
    }

}
