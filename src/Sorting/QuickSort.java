package Sorting;


public class QuickSort {
    public static void main(String[] args){
        int[] arr = {4,2,6,1,5};

        QuickPart(arr, 0 , arr.length-1);

        for(int num: arr){
            System.out.print(num);
        }
    }

    static void QuickPart(int[] arr, int low, int high){

        if(low < high){
            int p = LometaPartition.LomPar(arr,low, high);
            QuickPart(arr, low, p-1);
            QuickPart(arr, p+1, high);
        }

    }

    static void QuickPartHoar(int[] arr, int low, int high){

        if(low < high){
            int p = HoaresPartition.HorPar(arr,low, high);
            QuickPart(arr, low, p);
            QuickPart(arr, p+1, high);
        }

    }
}
