package Sorting;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {23,12,15,15,17,18};

        arr = SortFun(arr);

        for(int num: arr){
            System.out.println(num);
        }
    }

    static int[] SortFun(int[] arr){
        int n = arr.length;

        for(int i = 1; i < n;i++){
            int key = arr[i]; // current element
            int j = i-1; // First element
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }

       return arr;
    }
}
