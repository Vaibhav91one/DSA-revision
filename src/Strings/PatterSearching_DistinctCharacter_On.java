package Strings;

public class PatterSearching_DistinctCharacter_On {
    public static void main(String [] args){

        String txt = "ABCABCD";
        String pat = "ABCD";

        SearchDistinctPatter(txt, pat);

    }

    public static void SearchDistinctPatter(String txt, String pat){
        int n = txt.length();
        int m = pat.length();

        for(int i = 0; i <=n-m;){ // i++ removed because we are incrementing ourselves
            int j = 0;
            for(j = 0; j < m; j++){
                if(txt.charAt(i+j) != pat.charAt(j)){
                    break;
                }
            }
            if(j == m){
                System.out.println(i);
            }
            if(j == 0){
                i++;
            }
            else{
                i = i+j; // since there are distinct character the pattern can only match fully, so we jump to the element next to where the mismatch happens
            }
        }
    }

}
