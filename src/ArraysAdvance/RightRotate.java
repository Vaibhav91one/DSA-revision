package ArraysAdvance;

import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args){
        int[] arr = {1,5,0,0,2};
        int d = 2;
        int n = arr.length;


        System.out.println(Arrays.toString(Right(arr, d, n)));
    }

    public static int[] Right(int[] arr, int d, int n){
        reverse(arr, 0, n-1);
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
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
