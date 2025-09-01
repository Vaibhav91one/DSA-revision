package Sorting;

public class countingSort {
    public static void main(String[] args){
        int[] arr = {12, 11, 13, 5, 6, 7};
    int n = arr.length;
    int k = 14;

        CountSort(arr, n, k);

        for(int num: arr){
            System.out.println(num);
        }
    }

    public static void CountSort(int[] arr, int n, int k){
        int[] count = new int[k];

        for(int i = 0; i < n;i++){
            count[arr[i]]++;
        }

        for(int i = 1; i < k; i++){
            count[i] = count[i] + count[i-1];
        }

        int[] Output = new int[n];

        for(int i = n-1; i>=0;i--){
            Output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for(int i = 0; i < n;i++){
            arr[i] = Output[i];
        }

    }
}
