package Sorting;

public class LometaPartition {
    public static void main(String[] args){
        int[] arr = {4,2,6,1,5};

        LomPar(arr, 0 , arr.length-1);

        for(int num: arr){
            System.out.print(num);
        }
    }

    public static int LomPar(int[] arr, int low, int high){
        int i = low-1;
        int pivot = arr[high];

        for(int j = low; j <= high-1; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, high);

        return i+1;
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
