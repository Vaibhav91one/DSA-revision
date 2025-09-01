package Sorting;

public class MergeSort {
    public static void main(String[] args){
        int[] arr = {23,12,15,15,17,18};
        int[] arr2 = {22,2,11,14,15,8};

        SortFun(arr, arr2);

    }

    static void SortFun(int[] arr, int[] arr2){
        int n = arr.length;
        int m = arr2.length;

        int i = 0;
        int j = 0;

        while( i < n && j < m){
            if(arr[i] < arr2[j]){
                System.out.println(arr[i++]);
            }
            else{
                System.out.println(arr2[j++]);
            }
        }

        while( i < n){
            System.out.println(arr[i++]);
        }

        while( j < m){
            System.out.println(arr2[j++]);
        }



    }
}
