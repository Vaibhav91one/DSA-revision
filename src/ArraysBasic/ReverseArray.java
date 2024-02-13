package ArraysBasic;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {1,5,0,0,2};
        int n = arr.length;


        System.out.println(Arrays.toString(Reverse(arr, n)));
    }

    public static int[] Reverse(int[] arr, int n){
        int low = 0;
        int high = n-1;

        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

        return arr;
    }
}
