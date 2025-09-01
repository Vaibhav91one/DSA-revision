package ArraysBasic;

public class LargestElement_v2 {
    public static void main (String[] args){
        int[] arr = {1,8, 4, 2};
        int n = arr.length;
        System.out.println(ReturnLargest(arr, n));
    }

    public static int ReturnLargest(int[] arr, int n){

        int res = 0;

        for (int i = 0; i < n; i++){
            res = Math.max(arr[i], res);
        }

        return res;
    }
}
