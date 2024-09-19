package ArraysBasic;

public class SecondLargestElement_rev2 {
    public static void main(String[] args){
        int[] arr = {5,5,5};
        int n = arr.length;

        int result = SecondLargest(arr,n);
        System.out.println(result);
    }
    public static int SecondLargest(int[] arr, int n){
        int res = -1;
        int largest = -1;

        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                res = largest;
                largest = arr[i];
            }
            if(arr[i] != largest){
                if(res < arr[i] || res == -1){
                    res = arr[i];
                }
            }
        }

        return res;
    }
}
