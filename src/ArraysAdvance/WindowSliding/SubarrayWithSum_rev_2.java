package ArraysAdvance.WindowSliding;

public class SubarrayWithSum_rev_2 {
    public static void main(String[] args){
        int [] arr = {1, 4, 20, 3, 10, 5};
        int n = arr.length;
        int sum = 33;

        System.out.println(ReturnSubarrayWithSum(arr, n ,sum));

    }

    public static boolean ReturnSubarrayWithSum(int[] arr, int n, int sum){
        int curr_sum = arr[0];
        int s = 0;
        for(int i = 1; i < n; i++){

            while(curr_sum > sum && s < i){
                curr_sum -= arr[i];
                s++;
            }

            if(curr_sum == sum){
                return true;
            }

            if(s < i){
                curr_sum += arr[i];
            }
        }

        return curr_sum == sum;
    }
}
