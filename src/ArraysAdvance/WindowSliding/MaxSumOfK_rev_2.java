package ArraysAdvance.WindowSliding;

public class MaxSumOfK_rev_2 {
    public static void main(String[] args){
        int[] arr = {1, 8, 30, -5, 20, 7};
        int n = arr.length;
        int k = 3;

        System.out.println(ReturnMaxSum(arr, n , k));

    }

    public static int ReturnMaxSum(int[] arr , int n, int k){

        int res = 0;
        int curr_sum = 0;

        for(int i = 0; i < k;i++){
            curr_sum += arr[i];
        }

        res = curr_sum;

        for(int i = k; i<n;i++){
            curr_sum = curr_sum + arr[i] - arr[i-k];
            res = Math.max(curr_sum, res);
        }

        return res;
    }
}
