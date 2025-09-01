package Sorting;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {23,12,15,15,17,18};

        arr = SortFun(arr);

        for(int num: arr){
            System.out.println(num);
        }
    }

    static int[] SortFun(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n;i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}
