package ArraysAdvance.WindowSliding;

public class MaxSumOfk {
    public static void main(String[] args){
        int[] arr = {1,8, 30, -5, 20, 7};
        int k = 3;
        int n = 6;

        System.out.println(MaxSumK(arr,n, k));
    }

    public static int MaxSumK(int[] arr, int n, int k){
        int sum  = 0;
        int max = 0;

        for(int i = 0; i < k; i++){
            sum+= arr[i];
        }

        max = sum;

        for(int i = k; i < n; i++){
            sum += (arr[i] - arr[i-k]);
            max = Math.max(max, sum);
        }

        return max;
    }
}
