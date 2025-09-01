package Strings;

public class PatternSearching_RepeatingCharacers_Naive {
    public static void main(String[] args){
        String txt = "ABABAB";
        String pat = "ABAB";

        SearchPattern(txt,pat);

    }

    public static void SearchPattern(String txt, String pat){
        int n = txt.length();
        int m = pat.length();

        for(int i = 0; i <= n-m; i++){
            int j = 0;
            for(j = 0; j < m; j++){
                if(txt.charAt(i+j) != pat.charAt(j)){
                    break;
                }
            }
            if(j == m){
                System.out.println(i);
            }

        }
    }
}
