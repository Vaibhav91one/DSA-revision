package ArraysAdvance;

public class MajorityElement {
    public static void main(String[] args){
        int[] arr = {8,3,4,8,8};
        int n = 5;

        System.out.println(Majority(arr,n));
    }

    public static int Majority(int[] arr, int n){
        int res = 0;
        int count = 1;

        for(int i = 1; i < n; i++){

            if(arr[i] == arr[res]){
                count++;
                System.out.println(count);
            }

            else{
                count--;
                System.out.println(count);

            }

            if(count == 0){
                res = i;
                count = 1;
                System.out.println(count);
            }

        }

        return res;
    }
}
