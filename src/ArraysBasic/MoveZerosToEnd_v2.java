package ArraysBasic;

import java.util.Arrays;

public class MoveZerosToEnd_v2 {
    public static void main(String[] args){
        int[] arr = {0,1,0,1,0,1};
        int n = arr.length;
        ReturnMoveZerosToEnd(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    public static void ReturnMoveZerosToEnd (int[] arr, int n){
        int count = 0;
        int temp;

        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }



}
