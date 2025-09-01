package Strings;

import java.util.Arrays;

public class LeftMostCharacterRepeated {
    public static void main(String[] args){
        String str = "geeksforgeeks";

        System.out.println(ReturnLeftMostRepeated(str));
    }

    public static char ReturnLeftMostRepeated(String str){
        int[] count = new int[256];
        int res = Integer.MAX_VALUE; // Integer max because we are searching for a min value

        Arrays.fill(count, -1);

        for(int i = 0; i < str.length(); i++){
            if(count[str.charAt(i)] == -1){
                count[str.charAt(i)] = i;
            }
            else{
                res = Math.min(res, count[str.charAt(i)]);
            }
        }

        return str.charAt(res);
    }
}
