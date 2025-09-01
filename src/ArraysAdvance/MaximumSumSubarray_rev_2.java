package ArraysAdvance;

public class MaximumSumSubarray_rev_2 {
    public static void main(String[] args){
        int[] arr = {-3, 8, -2, 4, -5, 6};
        int n = arr.length;
        System.out.println(ReturnMaxSum(arr, n));
    }

    public static int ReturnMaxSum(int[] arr, int n){
        int res = arr[0];
        int MaxEnding = arr[0];

        for(int i = 1; i < n; i++){
            MaxEnding = Math.max(arr[i] , MaxEnding + arr[i]);
            res = Math.max(res, MaxEnding);
        }

        return res;
    }
}
