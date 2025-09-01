package ArraysAdvance;

public class MaximumConsecutives1s_rev_2 {
    public static void main(String [] args){
        int[] arr = {0, 1, 1, 0, 1, 1, 1};
        int n = arr.length;
        System.out.println(ReturnCount(arr, n));
    }

    public static int ReturnCount (int[] arr, int n){
        int res = 0;
        int curr = 0;


        for (int i = 0; i < n; i++){
            if(arr[i] == 0){
                curr = 0;
            }
            else {
                curr++;
                res = Math.max(res, curr);
            }
        }

        return res;
    }
}
