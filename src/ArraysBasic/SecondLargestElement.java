package ArraysBasic;

public class SecondLargestElement {
    public static void main(String[] args){
        int[] arr = {1,5,0,10};
        int n = arr.length;

        int result = SecondLargest(arr,n);
        System.out.println(result);
    }

    public static int SecondLargest(int[] arr, int n){
        int res = -1;
        int largest = 0;

        for(int i = 1; i < n; i++){
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            }

            if(arr[i] != arr[largest]){
                if(arr[i] > arr[res] || (res == -1)){
                    res = i;
                }
            }
        }

        return arr[res];
    }
}
