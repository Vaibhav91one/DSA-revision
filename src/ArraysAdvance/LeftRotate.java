package ArraysAdvance;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args){
        int[] arr = {1,5,0,0,2};
        int d = 2;
        int n = arr.length;


        System.out.println(Arrays.toString(Left(arr, d, n)));
    }



    public static int[] Left(int[] arr, int d, int n){
        reverse(arr, 0, d-1);
        // 5 1 0 0 2
        reverse(arr, d, n-1);
        // 5 1 2 0 0
        reverse(arr, 0, n-1);
        // 0 0 2 1 5

        return arr;
    }

    public static void reverse(int[] arr, int start, int end){
        int low = start;
        int high  = end;

        while (low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
