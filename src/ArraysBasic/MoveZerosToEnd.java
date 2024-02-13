package ArraysBasic;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args){
        int[] arr = {1,5,0,0,2};
        int n = arr.length;


        System.out.println(Arrays.toString(MoveZeros(arr, n)));
    }

    public static int[] MoveZeros(int[] arr, int n){

        int count = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] != 0){

                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
        }

        return arr;
    }
}
