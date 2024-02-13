package ArraysAdvance;

public class MaximumDifference {
    public static void main(String[] args){
        int[] arr = {2,3,10,6,8};
        int n = arr.length;

        System.out.println(MaxDiff(arr,n));
    }

    public static int MaxDiff(int[] arr, int n){
        int res = 0;
        int minVal = arr[0];

        for(int i = 0; i < n; i++){
            res = Math.max(arr[i] - minVal, res);
            minVal = Math.min(arr[i], minVal);
        }

        return res;
    }
}
