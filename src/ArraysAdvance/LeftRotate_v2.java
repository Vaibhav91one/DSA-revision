package ArraysAdvance;

import java.util.Arrays;

public class LeftRotate_v2 {
    public static void main (String[] args){
        int[] arr = {1,2,3,4,5};
        // Left Rotate ->  3, 4, 5, 1, 2
        // Right Rotate -> 4 ,5 , 1, 2, 3
        int n = arr.length;
        int d = 2;
//        ReturnLeftRotate(arr, n, d);
        ReturnRightRotate(arr, n , d);
        System.out.println(Arrays.toString(arr));
    }

    public static void ReturnLeftRotate(int[] arr, int n, int d){
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d , n-1);
        reverseArray(arr, 0 , n-1);
        //  reverse 0 to d - 1
        // 2 1 3 4 5
        // reverse d to n - 1
        // 2 1 5 4 3
        // reverse 0 to n-1
        // 3 4 5 1 2
    }

    public static void ReturnRightRotate(int[] arr, int n, int d){
        reverseArray(arr, 0 , n-1);
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d , n-1);
        // reverse 0 to n - 1
        // 5 4 3 2 1

        // reverse 0 to d - 1
        // 4 5 3 2 1

        // reverse d to n - 1
        // 4 5 1 2 3
    }

    public static void reverseArray(int[] arr, int starting_point, int end_point){
        int low = starting_point;
        int high = end_point;

        while (low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
