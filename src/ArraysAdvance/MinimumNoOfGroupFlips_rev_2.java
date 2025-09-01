package ArraysAdvance;

public class MinimumNoOfGroupFlips_rev_2 {
    public static void main(String[] args){
        int arr[] = {1, 1, 0, 0, 0, 1};
        int n = arr.length;

        PrintGroups(arr, n);
    }

    public static void PrintGroups(int[]arr , int n){

        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i-1]){ // start of a new group
                if(arr[i] != arr[0]){ // start of a new group different than the first group
                    System.out.print("From " + i + " to ");
                }
                else{
                    System.out.print(i-1); // indicating the group to be flipped has ended
                }
            }
        }

        // Edge case to handle where the last group is different than the first group
        // this means that the last round of the above will be incomplete
        // This case handles that
        if(arr[0] != arr[n-1]){
            System.out.println(n-1);
        }
    }
}
