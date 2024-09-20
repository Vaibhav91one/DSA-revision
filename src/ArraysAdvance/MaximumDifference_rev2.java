package ArraysAdvance;

public class MaximumDifference_rev2 {
    public static void main(String[] args){
        int[] arr = {2,3,10,6,8};
        int n = arr.length;

        System.out.println(MaxDiff(arr,n));
    }
    public static int MaxDiff(int[] arr, int n){
        int res = 0;
        int min = arr[0];

        for(int i = 1; i<n; i++){
            res = Math.max(res, arr[i] - min);
            min = Math.min(min, arr[i]);
        }

        return res;
    }
}
