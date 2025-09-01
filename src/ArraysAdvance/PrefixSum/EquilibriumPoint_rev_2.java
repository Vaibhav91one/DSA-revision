package ArraysAdvance.PrefixSum;

public class EquilibriumPoint_rev_2 {
    public static void main(String[] args){
        int[] arr = {2, -2, 4};
        int n = arr.length;

System.out.println(
        ReturnEquilibriumPoint(arr, n)
);
    }

    public static int ReturnEquilibriumPoint(int[] arr, int n){
        int sum = 0;
        int leftSum = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];
        }

        for(int i = 0; i < n; i++){
            if(leftSum == sum - arr[i]){
                return i;
            }
            leftSum += arr[i];
            sum -= arr[i];
        }

        return 0;
    }
}
