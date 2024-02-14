package ArraysAdvance.WindowSliding;

public class SubarrayWithSUm {

    public static void main(String[] args){
        int[] arr = {1,4,20,3,10,5};
        int sum = 33;
        int n = 6;

        System.out.println(ifExists(arr, n, sum));

    }

    public static boolean ifExists(int[] arr, int n, int sum){
        int start_index = 0;
        int curr_sum = arr[0];

        for(int e = 1; e < n; e++){

            while(curr_sum > sum && start_index < e-1){
                curr_sum -= arr[start_index];
                start_index++;
            }

            if(curr_sum == sum){
                return true;
            }

            if( e < n){
                curr_sum += arr[e];
            }

        }

        return curr_sum == sum;
    }

}
