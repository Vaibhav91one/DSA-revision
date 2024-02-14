package ArraysAdvance;

public class MaximumSumCircularSubarray {
    public static void main(String[] args){
       int[] arr = {10, 5, -5, 5};
       int n = 4;

       System.out.println(MaxSumCircular(arr, n));
    }

    public static int MaxSumCircular(int[] arr, int n){

        int maxNormal = MaxSum(arr,n);
        int sum = 0;

        if(maxNormal < 0){
            return maxNormal;
        }

        System.out.println(maxNormal);

        for(int i = 0; i < n; i++){
            sum += arr[i];
            arr[i] = -arr[i];
        }

        System.out.println(MaxSum(arr,n));

        int result = Math.max(MaxSum(arr,n) + sum, maxNormal);

        return result;

    }

    public static int MaxSum(int [] arr, int n){
        int maxEnding = arr[0];
        int res = arr[0];

        for(int i = 1; i < n; i++){
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }
}
