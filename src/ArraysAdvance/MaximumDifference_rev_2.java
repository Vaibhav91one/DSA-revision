package ArraysAdvance;

public class MaximumDifference_rev_2 {
    public static void main(String [] args){
        int[] arr= {2, 3, 10, 6, 4, 8};
        int n = arr.length;
        System.out.println(ReturnMaxDiff(arr, n));
    }

    public static int ReturnMaxDiff(int [] arr, int n){
        int res = arr[0];
        int minval = arr[0];

        for (int i = 1; i < n; i++){
            res = Math.max(res, arr[i] - minval);
            minval = Math.min(minval, arr[i]);
        }

        return res;
    }
}
