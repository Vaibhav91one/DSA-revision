package ArraysBasic;

public class LargestElement_rev2 {
    public static void main(String[]args){
        int[] arr = {1,5,0,10};
        int n = arr.length;

        int result = Largest(arr,n);
        System.out.println(result);
    }
    public static int Largest(int[] arr, int n){
        int res = 0;

        for(int i = 0; i < n; i++){
            res = Math.max(arr[i], res);
        }

        return res;
    }

}
