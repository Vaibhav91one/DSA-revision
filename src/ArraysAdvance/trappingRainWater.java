package ArraysAdvance;

public class trappingRainWater {
    public static void main(String[] args){
        int N = 6;
        int arr[] = {3,0,0,2,0,4};

        System.out.println(trappingWater(arr,N));
    }

    public static long trappingWater(int[] arr, int n) {
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int res = 0;

        leftMax[0] = arr[0];
        rightMax[n-1] = arr[n-1];

        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i], leftMax[i-1]);
        }

        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i], rightMax[i+1]);
        }

        for(int i = 1; i < n-1; i++){
            res += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        return res;
    }
}
