package ArraysAdvance;

public class MaximumSumSubarray {
    public static void main(String[] args){
        int[] arr = {2,3,-8, 7,-1,2,3};
        int n = 7;

        System.out.println(MaxSum(arr, n));
    }

    public static int MaxSum(int[] arr, int n){
        int res = arr[0];
        int maxEnding = arr[0];

        for(int i = 1; i < n; i++){
            maxEnding = Math.max(res + arr[i], arr[i]);
            res = Math.max(res,maxEnding);
        }

        return res;
    }
}
