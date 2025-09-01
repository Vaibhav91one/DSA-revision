package ArraysAdvance;

public class MaximumSumCircularSubarray_rev_2 {
    public static void main (String[] args){
        int[] arr = {8, -4, 3, -5, 4};
        int n = arr.length;
        System.out.println(ReturnMaxCircularSum(arr, n));
    }

    public static int ReturnMaxCircularSum(int[] arr, int n){
        int max_normal = ReturnMaxSum(arr , n);
        int arr_sum = 0;
        if(max_normal < 0) return max_normal;

        for(int i = 0; i < n; i++){
            arr_sum = arr_sum + arr[i]; //array sum
            arr[i] = -arr[i]; // inverting the array
        }

        int max_circular = arr_sum + ReturnMaxSum(arr , n);
        int res = Math.max(max_normal, max_circular);

        return res;
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
