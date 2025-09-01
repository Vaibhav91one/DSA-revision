package Sorting;

public class HoaresPartition {
    public static void main(String[] args){
        int[] arr = {4,2,6,1,5};

        HorPar(arr, 0 , arr.length-1);

        for(int num: arr){
            System.out.print(num);
        }
    }

    public static int HorPar(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;


        while(true){
            do {
                i++;
            } while(arr[i] < pivot);

            do {
                j--;
            } while(arr[j] > pivot);

            if(i >= j){
                return j;
            }

            swap(arr, i, j); // Fixed this line
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
