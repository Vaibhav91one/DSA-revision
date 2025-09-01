package Strings;

import java.util.Arrays;

public class LPS_Efficient {
    public static void main(String[] args){
        String str = "aaabaaaac";
        int[] lps = new int[str.length()];
        fillLps(str,lps);

        System.out.println(Arrays.toString(lps));
    }

    public static void fillLps(String str, int[] lps){
        lps[0] = 0;
        int n = str.length();
        int i = 1;
        int len = 0;

        while(i < n){
            if(str.charAt(i) == str.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }

            else{
                if(len == 0) {
                    lps[i] = 0;
                    i++;
                }

                else{
                    len = lps[len-1];
                }
            }
        }

    }


    }

