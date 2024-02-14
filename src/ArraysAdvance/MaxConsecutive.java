package ArraysAdvance;

public class MaxConsecutive {
    public static void main(String[] args){
        int[] arr = {0,1,1,0,1,1,1};
        int n = 7;

        System.out.println(MaxCons(arr,n));
    }

    public static int MaxCons(int[] arr, int n){
        int curr = 0;
        int res = 0;

        for(int i = 0; i < n; i++){

            if(arr[i] == 0){
                curr = 0;
            }

            else{
                curr++;
                res = Math.max(res, curr);
            }

        }

        return res;
    }
}
