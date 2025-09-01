package Sorting;

public class SelectionSort
{
    public static void main(String[] args){
        int[] arr = {23,12,15,15,17,18};

        arr = SortFun(arr);

        for(int num: arr){
            System.out.println(num);
        }
    }

    static int[] SortFun(int[] arr){
        int n = arr.length;

       for(int i = 0; i < n; i++){
           int minIndex = i;

           for(int j = i+1; j < n; j++){
               if(arr[j] < arr[minIndex]){
                   minIndex = j;
               }
           }

           int temp = arr[i];
           arr[i] = arr[minIndex];
           arr[minIndex] = temp;
       }

        return arr;
    }
}
