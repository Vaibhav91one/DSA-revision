package Recursion;

public class SubsetsSum {
    public static void main(String [] args){
        int[] arr = {10,3, 6, 9, 10};
        int sum = 8;

        System.out.print(SubsetSum(arr, sum, arr.length));
    }

    static Integer SubsetSum(int[] arr, int sum, int n){
        if (n == 0) {
            return (sum == 0) ? 1 : 0;
        }

        return SubsetSum(arr, sum, n-1) + SubsetSum(arr, sum-arr[n-1], n-1);

    }
}
