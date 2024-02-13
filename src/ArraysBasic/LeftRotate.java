package ArraysBasic;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args){
        int[] arr = {1,5,0,0,2};
        int n = arr.length;


        System.out.println(Arrays.toString(Left(arr, n)));
    }

    public static int[] Left(int[] arr, int n){
        int x = arr[0];

        int i = 0;

        for(i = 1; i < n; i++){
            arr[i-1] = arr[i];
        }

        arr[i-1] = x;

        return arr;
    }
}
