package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();

        a.add(4);
        a.add(24);
        a.add(32);
        a.add(2);
        a.add(1);

        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a, Collections.reverseOrder());
        System.out.println(a);
    }
}
