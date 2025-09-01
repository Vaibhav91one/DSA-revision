package ArraysAdvance;

public class MaximumLengthEvenOddSubarray {
    public static void main(String[] args){
        int[] arr= {10, 12, 4, 7, 8};
        int n = arr.length;
        System.out.println(ReturnMaxLength(arr, n));
    }

    public static int ReturnMaxLength(int[] arr, int n){
        int res = 1;
        int curr = 1;

        for(int i = 1; i < n;i++){
            if((arr[i]%2 == 0 && arr[i -1]%2 !=0) || (arr[i]%2 != 0 && arr[i-1]%2 ==0) ){
                curr++;
                res = Math.max(res, curr);
            }
            else {
                curr=1;
            }
        }

        return res;
    }
}
