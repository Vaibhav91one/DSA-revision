package Strings;

import java.util.Arrays;

public class LeftMostCharacterNotRepeated {
    public static void main(String[] args){
        String str = "geeksforgeeks";

        System.out.println(ReturnLeftMostNonRepeated(str));
    }

    public static char ReturnLeftMostNonRepeated(String str){
        int[] count = new int[256];
        int res = Integer.MAX_VALUE;

        Arrays.fill(count, -1);

        for(int i = 0; i < str.length(); i++){
            if(count[str.charAt(i)] == -1){
                count[str.charAt(i)] = i;
            }
            else{
                count[str.charAt(i)] = -2;
            }
        }

        for(int i = 0; i < count.length; i++){
            if(count[i] > 0){
                res = Math.min(res , count[i]);
            }
        }

        return str.charAt(res);
    }
}
