package ArraysAdvance;

public class MinimumGroupFlips {
    public static void main(String[] args){
        int[] arr = {0, 0, 1, 1, 0, 0, 1,1, 0, 1};
        int n = 10;

        MinFlips(arr,n);
    }

    public static void MinFlips(int[] arr, int n){

        for(int i = 1; i < n; i++){

            if(arr[i] != arr[i-1]){
                if(arr[i] != arr[0]){
                    System.out.println("FROM" + i);
                }
                else{
                    System.out.println(i - 1);
                }
            }

        }

        if(arr[0] != arr[n-1]){
            System.out.println(n-1);
        }

    }
}
