package ArraysAdvance.PrefixSum;

import java.util.Arrays;

public class TrappingRainWater_rev2 {
    public static void main(String[] args){
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingWater(arr));
    }

    public static int trappingWater(int[] arr){
        int n = arr.length;
        int res = 0;
        int[] Lmax = new int[n];
        int[] Rmax = new int[n];

        Lmax[0] = arr[0];
        Rmax[n-1] = arr[n-1];


        for(int i = 1; i < n; i++){
            Lmax[i] = Math.max(arr[i], Lmax[i-1]);
        }

        for(int i = n-2; i >=0; i--){
            Rmax[i] = Math.max(arr[i], Rmax[i+1]);
        }

        System.out.println(Arrays.toString(Lmax));
        System.out.println(Arrays.toString(Rmax));

        for(int i = 0; i < n;i++){
            res += Math.min(Lmax[i], Rmax[i]) - arr[i];
        }

        return res;
    }

}
