package Hashing;

import java.util.HashSet;

public class IntersectionOfTwoUnsortedArrays_rev2 {
    public static void main(String[] args){
        int[] a = {10, 15, 20, 15, 30, 30, 5};
        int[] b = {30, 5, 30, 80};

        PrintIntersection(a , b);
    }

    public static void PrintIntersection(int[] a, int[] b){
        int res = 0;

        HashSet<Integer> hset = new HashSet<>();

        for (int j : a) {
            hset.add(j);
        }

        for (int j : b) {
            if (hset.contains(j)) {
                res++;
                hset.remove(j);
            }
        }

        System.out.println(res);

    }
}
