package ArraysBasic;

public class SecondLargest_v2 {
    public static void main(String[] args){
        int[] arr = {8,1, 4, 2};
        int n = arr.length;
        System.out.println(ReturnSecondLargest(arr, n));
    }

    public static int ReturnSecondLargest(int[] arr, int n){

        int res = -1;
        int largest = 0;

        for (int i = 1; i < n; i++){
            if ( arr[i] > arr[largest]){
                res = largest;
                largest = i;
            }
            else if (arr[i] != arr[largest]){
                if (arr[i] > arr[res] || res == -1){
                    res = i;
                }
            }
        }

        return res;

    }
}
