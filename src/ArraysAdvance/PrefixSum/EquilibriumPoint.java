package ArraysAdvance.PrefixSum;

public class EquilibriumPoint {

    public static void main(String[] args){
        int[] arr = {2,-2,4};
        int n = 3;

        System.out.println(EquPoint(arr,n));
    }

    public static int EquPoint(int[] arr, int n){
        int sum = 0;


        for(int i = 0; i < n;i++){
            sum += arr[i];
        }

        int leftSum = 0;

        for(int i = 0; i < n; i++){
            sum -= arr[i];

            if(leftSum == sum){
                return i;
            }

            leftSum += arr[i];
        }

        return -1;
    }

}
