package ArraysAdvance;

import java.util.Arrays;

public class trappingRainWater_rev_2 {
    public static void main(String[] args){
        int [] arr = {5, 0, 6, 2, 3};
        int n = arr.length;

        System.out.println(ReturnTrappedWater(arr, n));
    }

    public static int ReturnTrappedWater(int[] arr, int n){
        int res = 0;
        int[] lMax = new int[n];
        int[] rMax = new int[n];

        lMax[0] = arr[0];
        rMax[n-1] = arr[n-1];

        for (int i = 1; i < n; i++){
            lMax[i] = Math.max(arr[i], lMax[i-1]);
        }

        for(int i = n-2 ; i >=0; i--){
            rMax[i] = Math.max(arr[i],rMax[i+1]);
        }

        System.out.println(Arrays.toString(lMax));
        System.out.println(Arrays.toString(rMax));

        for (int i = 0; i < n; i++){
            res += Math.min(lMax[i], rMax[i]) - arr[i];
        }
        return res;
    }
}
