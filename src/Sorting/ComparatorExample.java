package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args){
        Integer[] arr = {23,24,25,15,16};

        Arrays.sort(arr, new mySort());

        for(int num:  arr){
            System.out.println(num);
        }
    }


}

class mySort implements Comparator<Integer> {
    public int compare(Integer a, Integer b){
        return a-b;
    }

}
