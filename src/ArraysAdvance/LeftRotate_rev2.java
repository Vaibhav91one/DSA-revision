package ArraysAdvance;

import java.util.Arrays;

public class LeftRotate_rev2 {

    public static void main(String[]args){
            int[] arr = {1,5,0,0,2};
            int d = 2;
            int n = arr.length;

//            2, 0, 0, 5, 1 => reverse whole array
//            2, 0, 0, 1, 5 => reverse d to n-1
//            0, 0, 2, 1, 5 => reverse 0 to d

            System.out.println(Arrays.toString(Left(arr, d, n)));
    }

    public static int[] Left(int[] arr, int d, int n){
            reverse(arr, 0, n-1);
            reverse(arr, d+1, n-1);
            reverse(arr, 0, d);

            return arr;
    }

    public static void reverse(int[] arr, int low, int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }



}
